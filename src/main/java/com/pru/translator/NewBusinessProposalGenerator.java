package com.pru.translator;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.flink.api.java.utils.ParameterTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pru.app.start.NewBusinessProposalFlinkJob;
import com.pru.config.PropertyLoader;
import com.pru.constant.ILConfigConstants;
import com.pru.constant.IntegrationConstants;
import com.pru.mapper.impl.OrikaModelClientMapperImpl;
import com.pru.mapper.impl.OrikaModelNewBusinessMapperImpl;
import com.pru.model.il.CLICRPIREC;
import com.pru.model.il.MSPContext;
import com.pru.model.il.NBSCRTIREC;
import com.pru.model.il.RequestParameter;
import com.pru.model.il.RequestParameters;
import com.pru.model.middleware.ClientDetails;
import com.pru.model.middleware.NewBusinessModel;

public class NewBusinessProposalGenerator {
	private final static Logger logger = LoggerFactory.getLogger(NewBusinessProposalGenerator.class);
	private XSLTransformer xslTransformer;
	private OrikaModelClientMapperImpl orikaModelConverter = new OrikaModelClientMapperImpl();
	private OrikaModelNewBusinessMapperImpl orikaModelNewBusinessMapperImpl = new OrikaModelNewBusinessMapperImpl();
	private static Map<String, String> newBusinessProposalMappingMap = new HashMap<>();
	private static Map<String, String> createClientMappingMap = new HashMap<>();
	private boolean isZambia = false;
	private boolean isUganda = false;
	private ParameterTool ilPropConfig;

	public NewBusinessProposalGenerator() {
		ilPropConfig = PropertyLoader.getIlPropConfig();
		xslTransformer = new XSLTransformer();
		loadMaps();
	}

	private void loadMaps() {
		logger.info("loadMaps() start");
		convertNewBusinessPropertyToMap();
		convertClientPropertyToMap();
		logger.info("loadMaps() end");
	}

	private String jaxbNewBusinessToXML(NBSCRTIREC nbsILModel) {
		StringWriter sw = null;
		try {
			JAXBContext context = JAXBContext.newInstance(NBSCRTIREC.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			sw = new StringWriter();
			m.marshal(nbsILModel, sw);
			logger.info(sw.toString());

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return sw.toString();

	}

	private String jaxbClientToXML(CLICRPIREC nbsILModel) {
		StringWriter sw = null;
		try {
			JAXBContext context = JAXBContext.newInstance(CLICRPIREC.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			sw = new StringWriter();
			m.marshal(nbsILModel, sw);
			logger.info(sw.toString());

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return sw.toString();

	}

	public String buildNewBusinessProposalRequest(NewBusinessModel newBusinessModel) {
		logger.info("buildNewBusinessProposalRequest() :: start");
		NBSCRTIREC newBusinessCreate = (NBSCRTIREC) orikaModelNewBusinessMapperImpl.map(newBusinessModel,
				NewBusinessModel.class, NBSCRTIREC.class, newBusinessProposalMappingMap);
		logger.debug("newBusinessCreate IL Object created :: {}",newBusinessCreate);
		MSPContext mspContext = new MSPContext();
		mspContext.setUserId(ilPropConfig.get(ILConfigConstants.NEWBUSINESS_USERID));
		mspContext.setUserPassword(ilPropConfig.get(ILConfigConstants.NEWBUSINESS_PASSWORD));
		RequestParameters reqParas = null;
		if (isZambia) {
			reqParas = setNbsRequestParaForZambia();

		} else if (isUganda) {
			reqParas = setNbsRequestParaForUganda();

		}
		mspContext.setRequestParameters(reqParas);
		newBusinessCreate.setMspContext(mspContext);
		String body = jaxbNewBusinessToXML(newBusinessCreate);
		logger.info("buildNewBusinessProposalRequest() :: end");
		return generateNBSSoapEnvelop(body);
	}

	public String buildCreateClientRequest(NewBusinessModel newBusinessModel) {
		logger.info("buildCreateClientRequest() :: start");
		ClientDetails clientDetails = newBusinessModel.getClientDetails().get(0);
		CLICRPIREC clientCreate = (CLICRPIREC) orikaModelConverter.map(clientDetails, ClientDetails.class,
				CLICRPIREC.class, createClientMappingMap);
		logger.debug("clientCreate IL Object created :: {}",clientCreate);
		MSPContext mspContext = new MSPContext();
		mspContext.setUserId(ilPropConfig.get(ILConfigConstants.CLIENT_USERID));
		mspContext.setUserPassword(ilPropConfig.get(ILConfigConstants.CLIENT_PASSWORD));
		RequestParameters reqParas = null;
		if (null != clientDetails) {
			if (null != clientDetails.getCountryCode() && clientDetails.getCountryCode().equalsIgnoreCase(ILConfigConstants.COUNTRY_CODE_ZAMBIA)) {
				reqParas = setClientRequestParaForZambia();
				logger.info("=================Zambia Properties" + clientDetails.getCountryCode());
				isZambia = true;

			} else if (null != clientDetails.getCountryCode()
					&& clientDetails.getCountryCode().equalsIgnoreCase(ILConfigConstants.COUNTRY_CODE_UGANDA)) {
				reqParas = setClientRequestParaForUganda();
				logger.info("=================Uganda Properties" + clientDetails.getCountryCode());
				isUganda = true;
			}
		}

		mspContext.setRequestParameters(reqParas);
		clientCreate.setMSPContext(mspContext);
		String body = jaxbClientToXML(clientCreate);
		logger.info("buildCreateClientRequest() :: end");
		return generateCLISoapEnvelop(body);
	}

	private RequestParameters setClientRequestParaForZambia() {
		RequestParameters reqParas = new RequestParameters();
		RequestParameter reqPara = new RequestParameter();
		reqPara.setName(ilPropConfig.get(ILConfigConstants.ZMB_CLIENT_REQPRM_NAME));
		reqPara.setValue(ilPropConfig.get(ILConfigConstants.ZMB_CLIENT_REQPRM_VALUE));
		RequestParameter reqPara1 = new RequestParameter();
		reqPara1.setName(ilPropConfig.get(ILConfigConstants.ZMB_NEWBIZ_REQPRM_NAME));
		reqPara1.setValue(ilPropConfig.get(ILConfigConstants.ZMB_NEWBIZ_REQPRM_VALUE));
		reqParas.getRequestParameter().add(reqPara);
		reqParas.getRequestParameter().add(reqPara1);
		return reqParas;
	}

	private RequestParameters setClientRequestParaForUganda() {
		RequestParameters reqParas = new RequestParameters();
		RequestParameter reqPara = new RequestParameter();
		reqPara.setName(ilPropConfig.get(ILConfigConstants.UGD_CLIENT_REQPRM_NAME));
		reqPara.setValue(ilPropConfig.get(ILConfigConstants.UGD_CLIENT_REQPRM_VALUE));
		RequestParameter reqPara1 = new RequestParameter();
		reqPara1.setName(ilPropConfig.get(ILConfigConstants.UGD_NEWBIZ_REQPRM_NAME));
		reqPara1.setValue(ilPropConfig.get(ILConfigConstants.UGD_NEWBIZ_REQPRM_VALUE));
		reqParas.getRequestParameter().add(reqPara);
		reqParas.getRequestParameter().add(reqPara1);
		return reqParas;
	}

	private RequestParameters setNbsRequestParaForZambia() {
		RequestParameters reqParas = new RequestParameters();
		RequestParameter reqPara = new RequestParameter();
		reqPara.setName(ilPropConfig.get(ILConfigConstants.ZMB_NEWBIZ_REQPRM_NAME));
		reqPara.setValue(ilPropConfig.get(ILConfigConstants.ZMB_NEWBIZ_REQPRM_VALUE));
		reqParas.getRequestParameter().add(reqPara);
		return reqParas;
	}

	private RequestParameters setNbsRequestParaForUganda() {
		RequestParameters reqParas = new RequestParameters();
		RequestParameter reqPara = new RequestParameter();
		reqPara.setName(ilPropConfig.get(ILConfigConstants.UGD_NEWBIZ_REQPRM_NAME));
		reqPara.setValue(ilPropConfig.get(ILConfigConstants.UGD_NEWBIZ_REQPRM_VALUE));
		reqParas.getRequestParameter().add(reqPara);
		return reqParas;
	}

	private String generateNBSSoapEnvelop(String body) {
		return xslTransformer.transform(IntegrationConstants.NBS_XSLT_FILE_NAME, body);
	}

	private String generateCLISoapEnvelop(String body) {
		return xslTransformer.transform(IntegrationConstants.CLI_XSLT_FILE_NAME, body);
	}

	private static void convertNewBusinessPropertyToMap() {
		newBusinessProposalMappingMap= PropertyLoader.getNewBizProposalPropConfig().toMap();
	}

	private static void convertClientPropertyToMap() {
		createClientMappingMap = PropertyLoader.getCreateClientPropConfig().toMap();
	}
}
