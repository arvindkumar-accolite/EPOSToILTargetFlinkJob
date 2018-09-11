package com.pru.service.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPMessage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pru.constant.IntegrationConstants;
import com.pru.model.middleware.NewBusinessModel;
import com.pru.model.middleware.OwnerDetails;
import com.pru.service.ILService;
import com.pru.translator.NewBusinessProposalGenerator;
import com.sun.xml.messaging.saaj.soap.impl.ElementImpl;

public class ILServiceImpl implements ILService {
	
	private NewBusinessProposalGenerator newBusinessProposalGenerator;

	public ILServiceImpl(){
		newBusinessProposalGenerator = new NewBusinessProposalGenerator();
	}
	public String serviceRequest(String json) {
		NewBusinessModel newBusinessModel = policyObjectPopulator(json);
		String createClientSoapEnvelop = newBusinessProposalGenerator.buildCreateClientRequest(newBusinessModel);
		System.out.println("=========Create Client Soap Envelop=========");
		// System.out.println(createClientSoapEnvelop);
		// System.out.println("=========Create Client Response=========");
		SOAPBody clientResponseSoapBody = invokeILSoapService(createClientSoapEnvelop, IntegrationConstants.CLIENT_URL);
		// System.out.println("=========Create Client Response=========");
		// System.out.println(clientResponseSoapBody.toString());
		String clientNumber = getClientNumberFromSoapBody(clientResponseSoapBody);
		System.out.println("=========Cleint Number :" + clientNumber);
		setClientIdToNewBusinessObject(newBusinessModel, clientNumber);
		String newBusinessSoapEnvelop = newBusinessProposalGenerator.buildNewBusinessProposalRequest(newBusinessModel);
		System.out.println("=========NewBusinessProposal Soap Envelop=========");
		// System.out.println(newBusinessSoapEnvelop);
		SOAPBody nbsResponseSoapBody = invokeILSoapService(newBusinessSoapEnvelop,
				IntegrationConstants.NEW_BUSINESS_URL);
		// System.out.println(nbsResponseSoapBody.toString());

		String nbsContractNum = getNBSContractNummberFromSoapBody(nbsResponseSoapBody);
		System.out.println("=========NewBusinessProposal Contract Number=========");
		System.out.println(nbsContractNum);

		return nbsContractNum == null ? "" : nbsContractNum;
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
			System.out.println("\n Soap Response=========:\n");
			response.writeTo(System.out);
			System.out.println();
			return response.getSOAPBody();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private String getClientNumberFromSoapBody(SOAPBody soapBody) {
		SOAPMessage response = null;
		try {
			Iterator updates = soapBody.getChildElements();
			System.out.println("'@@@@@@@@@@@" + updates.hashCode());
			while (updates.hasNext()) {
				System.out.println();
				// The listing and its ID
				SOAPElement update = (SOAPElement) updates.next();
				QName name = new QName(IntegrationConstants.IL_TAG_CLNTNUM);
				Iterator i = update.getChildElements(name);
				while (i.hasNext()) {
					ElementImpl clientNum = (ElementImpl) i.next();
					return clientNum.getValue();
				}
			}
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private String getNBSContractNummberFromSoapBody(SOAPBody soapBody) {
		SOAPMessage response = null;
		try {
			Iterator updates = soapBody.getChildElements();
			// System.out.println("'@@@@@@@@@@@" + updates.hashCode());
			while (updates.hasNext()) {
				System.out.println();
				// The listing and its ID
				SOAPElement update = (SOAPElement) updates.next();
				QName name = new QName(IntegrationConstants.IL_TAG_CHDRSEL);
				Iterator i = update.getChildElements(name);
				while (i.hasNext()) {
					ElementImpl nbsContractNum = (ElementImpl) i.next();
					return nbsContractNum.getValue();
				}
			}
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*public static void main(String[] args) {
		try {
			ILServiceImpl ilServiceImpl = new ILServiceImpl();
			ilServiceImpl.serviceRequest(readFile("./resources/jsonMiddleware.txt"));
		} catch (IOException e) { // TODO Auto-generated catch block
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
*/
}
