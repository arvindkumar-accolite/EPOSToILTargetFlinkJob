package com.prud.service.impl;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
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
import com.prud.model.middleware.OwnerDetails;
import com.prud.service.ILService;
import com.prud.translator.NewBusinessProposalGenerator;

public class ILServiceImpl implements ILService {
	private NewBusinessProposalGenerator newBusinessProposalGenerator = new NewBusinessProposalGenerator();
	public static final String CLIENT_URL = "";
	public static final String NEW_BUSINESS_URL = "";

	public String serviceRequest(String json) {
		NewBusinessModel newBusinessModel = policyObjectPopulator(json);
		String createClientSoapEnvelop = newBusinessProposalGenerator.buildCreateClientRequest(newBusinessModel);
		System.out.println("Envelop " + createClientSoapEnvelop);
		//String clientNumber = invokeILSoapService(createClientSoapEnvelop, CLIENT_URL).getAttribute("CLNTNUM");
		setClientIdToNewBusinessObject(newBusinessModel, "123456");
		//newBusinessModel.getClientDetails().get(0).setClientNumber("12");
		String newBusinessSoapEnvelop = newBusinessProposalGenerator.buildNewBusinessProposalRequest(newBusinessModel);
		System.out.println(newBusinessSoapEnvelop);
		//System.out.println(invokeILSoapService(newBusinessSoapEnvelop, NEW_BUSINESS_URL).toString());

		return createClientSoapEnvelop;
	}
	private void setClientIdToNewBusinessObject(NewBusinessModel newBusinessModel, String clientNumber) {
		newBusinessModel.getClientDetails().get(0).setClientNumber(clientNumber);
		newBusinessModel.getClientDetails().get(0).setEntId(clientNumber);
		newBusinessModel.getClientDetails().get(0).setParty(clientNumber);
		newBusinessModel.getLifeDetails().get(0).setLifeId(clientNumber);
		newBusinessModel.getLifeDetails().get(0).setLifeParty(clientNumber);
		newBusinessModel.getCoverageDetails().get(0).setCoverageId(clientNumber);
		newBusinessModel.getCoverageDetails().get(0).setCoverageParent(clientNumber);
		newBusinessModel.getRiderDetails().get(0).setRiderId(clientNumber);
		newBusinessModel.getRiderDetails().get(0).setRiderParent(clientNumber);
		OwnerDetails ownerDetails = new OwnerDetails();
		ownerDetails.setOwnerentId(clientNumber);
		ownerDetails.setOwnerParty(clientNumber);
		newBusinessModel.setOwnerDetails(ownerDetails);
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

	private SOAPBody invokeILSoapService(String soapEnvelop, String url) {
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		try {
			ILServiceImpl ilServiceImpl = new ILServiceImpl();
			ilServiceImpl.serviceRequest(readFile("./resources/jsonMiddleware.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String readFile(String file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");

		try {
			while ((line = reader.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append(ls);
			}

			return stringBuilder.toString();
		} finally {
			reader.close();
		}
	}

}
