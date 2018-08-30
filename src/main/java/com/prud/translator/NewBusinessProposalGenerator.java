package com.prud.translator;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.prud.constant.IntegrationConstants;
import com.prud.mapper.impl.OrikaModelClientMapperImpl;
import com.prud.mapper.impl.OrikaModelNewBusinessMapperImpl;
import com.prud.model.il.CLICRPIREC;
import com.prud.model.il.MSPContext;
import com.prud.model.il.NBSCRTIREC;
import com.prud.model.il.NBSCRTIREC.NBSCRTICLIENT;
import com.prud.model.il.RequestParameter;
import com.prud.model.il.RequestParameters;
import com.prud.model.middleware.ClientDetails;
import com.prud.model.middleware.NewBusinessModel;

public class NewBusinessProposalGenerator {

	private XSLTransformer xslTransformer = new XSLTransformer();
	private OrikaModelClientMapperImpl orikaModelConverter = new OrikaModelClientMapperImpl();
	private OrikaModelNewBusinessMapperImpl orikaModelNewBusinessMapperImpl = new OrikaModelNewBusinessMapperImpl(); 
	private static Properties newBusinessProposalPropConfig;
	private static Properties createClientPropConfig;
	private static Map<String, String> newBusinessProposalMappingMap = new HashMap<>();	
	private static Map<String, String> createClientMappingMap = new HashMap<>();
	
	static {
		newBusinessProposalPropConfig = new Properties();
		createClientPropConfig = new Properties();
		InputStream input1 = null;
		InputStream input2 = null;
		try {
			input1 = new FileInputStream(Object.class.getResource("/policyproposal-to-newbusinessmapping.properties").getFile());
			newBusinessProposalPropConfig.load(input1);
			input1.close();
			input2 = new FileInputStream(Object.class.getResource("/policyproposal-to-client-mapping.properties").getFile());
			createClientPropConfig.load(input2);
			input2.close();
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
		mspContext.setUserId("userId");
		mspContext.setUserPassword("password");
		RequestParameters reqParas = new RequestParameters();
		RequestParameter reqPara = new RequestParameter();
		reqPara.setName(IntegrationConstants.CLIENT_CREATE_REQUEST_PARAMETER_NAME);
		reqPara.setValue(IntegrationConstants.CLIENT_CREATE_REQUEST_PARAMETER_VALUE);
		reqParas.getRequestParameter().add(reqPara);
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
		mspContext.setUserId("userId");
		mspContext.setUserPassword("password");
		RequestParameters reqParas = new RequestParameters();
		RequestParameter reqPara = new RequestParameter();
		reqPara.setName(IntegrationConstants.CLIENT_CREATE_REQUEST_PARAMETER_NAME);
		reqPara.setValue(IntegrationConstants.CLIENT_CREATE_REQUEST_PARAMETER_VALUE);
		reqParas.getRequestParameter().add(reqPara);
		mspContext.setRequestParameters(reqParas);
		clientCreate.setMSPContext(mspContext);
		String body = jaxbClientToXML(clientCreate);
		return generateCLISoapEnvelop(body);
	}

	private String generateNBSSoapEnvelop(String body) {
		return xslTransformer.transform(IntegrationConstants.NBS_XSLT_FILE_NAME, body);
	}
	private String generateCLISoapEnvelop(String body) {
		return xslTransformer.transform(IntegrationConstants.CLI_XSLT_FILE_NAME, body);
	}
	
	private static void convertNewBusinessPropertyToMap(){
		for (final String name: newBusinessProposalPropConfig.stringPropertyNames())
			newBusinessProposalMappingMap.put(name, newBusinessProposalPropConfig.getProperty(name));
	}
	private static void convertClientPropertyToMap(){
		for (final String name: createClientPropConfig.stringPropertyNames())
			createClientMappingMap.put(name, createClientPropConfig.getProperty(name));
	}
}
