package com.prud.service.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPMessage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prud.model.middleware.NewBusinessModel;
import com.prud.service.ILService;
import com.prud.translator.NewBusinessProposalGenerator;

public class ILServiceImpl implements ILService {
	private NewBusinessProposalGenerator newBusinessProposalGenerator;
	public static final String REST_SERVICE_URI = "http://localhost:8099/kafka/send/message";

	public String serviceRequest(String json) {
		NewBusinessModel  newBusinessModel = policyObjectPopulator(json);
		String createClientSoapEnvelop = newBusinessProposalGenerator.buildCreateClientRequest(newBusinessModel);
		System.out.println("Envelop " + createClientSoapEnvelop);
		String clientNumber = invokeILSoapService(createClientSoapEnvelop,"").getAttribute("");
		
		invokeILSoapService(createClientSoapEnvelop,"");
		return createClientSoapEnvelop;
	}

	private NewBusinessModel policyObjectPopulator(String json) {
		ObjectMapper mapper = new ObjectMapper();
		NewBusinessModel newBusinessModel = null;
		System.out.println();
		try {
			newBusinessModel = mapper.readValue(json, NewBusinessModel.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return newBusinessModel;
	}
	private SOAPBody invokeILSoapService(String soapEnvelop,String url) {
		SOAPMessage response = null;
		try {
			SOAPConnectionFactory sfc = SOAPConnectionFactory.newInstance();
		    SOAPConnection connection = sfc.createConnection();
		    InputStream is = new ByteArrayInputStream(soapEnvelop.getBytes());
		    SOAPMessage request = MessageFactory.newInstance().createMessage(null, is);
			System.out.println("\n Soap Request:\n");
		    request.writeTo(System.out);
			System.out.println();
			URL endpoint = new URL(url);
			response = connection.call(request, endpoint);
			System.out.println("\n Soap Response:\n");
			response.writeTo(System.out);
            System.out.println();
			return response.getSOAPBody();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}
