package com.prud.translator;

import java.io.StringWriter;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.prud.constant.IntegrationConstants;
import com.prud.mapper.impl.NewBusinessPopulator;
import com.prud.mapper.impl.OrikaModelMapperImpl;
import com.prud.model.il.CLICRPIREC;
import com.prud.model.il.MSPContext;
import com.prud.model.il.RequestParameter;
import com.prud.model.il.RequestParameters;
import com.prud.model.middleware.ClientDetails;

public class EposToILTranslator {

	private XSLTransformer xslTransformer;
	private OrikaModelMapperImpl orikaModelConverter;
	private NewBusinessPopulator newBusinessPopulator;

	@Resource(name = "clientMappingProperty")
	private Map<String, String> clientMappingProperties;
	//@Value("${USER_NAME}")
	private String userId;

	//@Value("${PASSWORD}")
	private String password;

	private String jaxbObjectToXML(CLICRPIREC CLICRPIREC) {
		StringWriter sw = null;
		try {
			JAXBContext context = JAXBContext.newInstance(CLICRPIREC.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			sw = new StringWriter();
			m.marshal(CLICRPIREC, sw);
			System.out.println(sw.toString());

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return sw.toString();

	}

	public String generateILRequest(String json) {
		ClientDetails clientDetails = null;
		CLICRPIREC clientCreate = (CLICRPIREC) orikaModelConverter.map(clientDetails, ClientDetails.class,
				CLICRPIREC.class, clientMappingProperties);
		MSPContext mspContext = new MSPContext();
		mspContext.setUserId(userId);
		mspContext.setUserPassword(password);
		RequestParameters reqParas = new RequestParameters();
		RequestParameter reqPara = new RequestParameter();
		reqPara.setName(IntegrationConstants.CLIENT_CREATE_REQUEST_PARAMETER_NAME);
		reqPara.setValue(IntegrationConstants.CLIENT_CREATE_REQUEST_PARAMETER_VALUE);
		reqParas.getRequestParameter().add(reqPara);
		mspContext.setRequestParameters(reqParas);
		clientCreate.setMSPContext(mspContext);
		String body = jaxbObjectToXML(clientCreate);
		return generateSoapEnvelop(body);
	}

	private String generateSoapEnvelop(String body) {
		return xslTransformer.transform(IntegrationConstants.XSLT_FILE_NAME, body);
	}

}
