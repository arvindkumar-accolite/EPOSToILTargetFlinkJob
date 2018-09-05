package com.pru.translator;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

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

	private XSLTransformer xslTransformer;
	private OrikaModelClientMapperImpl orikaModelConverter = new OrikaModelClientMapperImpl();
	private OrikaModelNewBusinessMapperImpl orikaModelNewBusinessMapperImpl = new OrikaModelNewBusinessMapperImpl();
	private static Properties newBusinessProposalPropConfig;
	private static Properties createClientPropConfig;
	private static Properties ilPropConfig;

	private static Map<String, String> newBusinessProposalMappingMap = new HashMap<>();
	private static Map<String, String> createClientMappingMap = new HashMap<>();
	private boolean isZambia = false;
	private boolean isUganda = false;
	
	public NewBusinessProposalGenerator(String path) {
		xslTransformer = new XSLTransformer(path);
		loadProperties(path);
	}
	private static void loadProperties(String path) {
		ilPropConfig = new Properties();
		newBusinessProposalPropConfig = new Properties();
		createClientPropConfig = new Properties();
		InputStream input1 = null;
		InputStream input2 = null;
		InputStream input3 = null;
		try {
			input1 = new FileInputStream(path+"\\resources\\policyproposal-to-newbusinessmapping.properties");
			newBusinessProposalPropConfig.load(input1);
			input1.close();
			input2 = new FileInputStream(path+"\\resources\\policyproposal-to-client-mapping.properties");
			createClientPropConfig.load(input2);
			input2.close();
			input3 = new FileInputStream(path+"\\resources\\il-config.properties");
			ilPropConfig.load(input3);
			input3.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		convertNewBusinessPropertyToMap();
		convertClientPropertyToMap();
	}

	private String jaxbNewBusinessToXML(NBSCRTIREC nbsILModel) {
		StringWriter sw = null;
		try {
			JAXBContext context = JAXBContext.newInstance(NBSCRTIREC.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			sw = new StringWriter();
			m.marshal(nbsILModel, sw);
			System.out.println(sw.toString());

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
			System.out.println(sw.toString());

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return sw.toString();

	}

	public String buildNewBusinessProposalRequest(NewBusinessModel newBusinessModel) {
		NBSCRTIREC newBusinessCreate = (NBSCRTIREC) orikaModelNewBusinessMapperImpl.map(newBusinessModel,
				NewBusinessModel.class, NBSCRTIREC.class, newBusinessProposalMappingMap);
		MSPContext mspContext = new MSPContext();
		mspContext.setUserId(ilPropConfig.getProperty("newbusiness.userid"));
		mspContext.setUserPassword(ilPropConfig.getProperty("newbusiness.password"));
		RequestParameters reqParas = null;
		if (isZambia) {
			reqParas = setNbsRequestParaForZambia();

		} else if (isUganda) {
			reqParas = setNbsRequestParaForUganda();

		}
		mspContext.setRequestParameters(reqParas);
		newBusinessCreate.setMspContext(mspContext);
		String body = jaxbNewBusinessToXML(newBusinessCreate);
		return generateNBSSoapEnvelop(body);
	}

	public String buildCreateClientRequest(NewBusinessModel newBusinessModel) {
		ClientDetails clientDetails = newBusinessModel.getClientDetails().get(0);
		CLICRPIREC clientCreate = (CLICRPIREC) orikaModelConverter.map(clientDetails, ClientDetails.class,
				CLICRPIREC.class, createClientMappingMap);
		MSPContext mspContext = new MSPContext();
		mspContext.setUserId(ilPropConfig.getProperty("client.userid"));
		mspContext.setUserPassword(ilPropConfig.getProperty("client.password"));
		RequestParameters reqParas = null;
		if (null != clientDetails) {
			if (null != clientDetails.getCountryCode() && clientDetails.getCountryCode().equalsIgnoreCase("Z")) {
				reqParas = setClientRequestParaForZambia();
				System.out.println("=================Zambia Properties" + clientDetails.getCountryCode());
				isZambia = true;

			} else if (null != clientDetails.getCountryCode()
					&& clientDetails.getCountryCode().equalsIgnoreCase("UGD")) {
				reqParas = setClientRequestParaForUganda();
				System.out.println("=================Uganda Properties" + clientDetails.getCountryCode());
				isUganda = true;
			}
		}

		mspContext.setRequestParameters(reqParas);
		clientCreate.setMSPContext(mspContext);
		String body = jaxbClientToXML(clientCreate);
		return generateCLISoapEnvelop(body);
	}

	private RequestParameters setClientRequestParaForZambia() {
		RequestParameters reqParas = new RequestParameters();
		RequestParameter reqPara = new RequestParameter();
		reqPara.setName(ilPropConfig.getProperty("zambia.client.requestparam.name"));
		reqPara.setValue(ilPropConfig.getProperty("zambia.client.requestparam.value"));
		RequestParameter reqPara1 = new RequestParameter();
		reqPara1.setName(ilPropConfig.getProperty("zambia.newbusiness.requestparam.name"));
		reqPara1.setValue(ilPropConfig.getProperty("zambia.newbusiness.requestparam.value"));
		reqParas.getRequestParameter().add(reqPara);
		reqParas.getRequestParameter().add(reqPara1);
		return reqParas;
	}

	private RequestParameters setClientRequestParaForUganda() {
		RequestParameters reqParas = new RequestParameters();
		RequestParameter reqPara = new RequestParameter();
		reqPara.setName(ilPropConfig.getProperty("uganda.client.requestparam.name"));
		reqPara.setValue(ilPropConfig.getProperty("uganda.client.requestparam.value"));
		RequestParameter reqPara1 = new RequestParameter();
		reqPara1.setName(ilPropConfig.getProperty("uganda.newbusiness.requestparam.name"));
		reqPara1.setValue(ilPropConfig.getProperty("uganda.newbusiness.requestparam.value"));
		reqParas.getRequestParameter().add(reqPara);
		reqParas.getRequestParameter().add(reqPara1);
		return reqParas;
	}

	private RequestParameters setNbsRequestParaForZambia() {
		RequestParameters reqParas = new RequestParameters();
		RequestParameter reqPara = new RequestParameter();
		reqPara.setName(ilPropConfig.getProperty("zambia.newbusiness.requestparam.name"));
		reqPara.setValue(ilPropConfig.getProperty("zambia.newbusiness.requestparam.value"));
		reqParas.getRequestParameter().add(reqPara);
		return reqParas;
	}

	private RequestParameters setNbsRequestParaForUganda() {
		RequestParameters reqParas = new RequestParameters();
		RequestParameter reqPara = new RequestParameter();
		reqPara.setName(ilPropConfig.getProperty("uganda.newbusiness.requestparam.name"));
		reqPara.setValue(ilPropConfig.getProperty("uganda.newbusiness.requestparam.value"));
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
		for (final String name : newBusinessProposalPropConfig.stringPropertyNames())
			newBusinessProposalMappingMap.put(name, newBusinessProposalPropConfig.getProperty(name));
	}

	private static void convertClientPropertyToMap() {
		for (final String name : createClientPropConfig.stringPropertyNames())
			createClientMappingMap.put(name, createClientPropConfig.getProperty(name));
	}
}
