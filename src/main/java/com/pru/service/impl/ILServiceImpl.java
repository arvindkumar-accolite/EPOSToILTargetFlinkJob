package com.pru.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pru.constant.IntegrationConstants;
import com.pru.model.middleware.NewBusinessModel;
import com.pru.model.middleware.OwnerDetails;
import com.pru.service.ILService;
import com.pru.translator.NewBusinessProposalGenerator;
import com.sun.xml.messaging.saaj.soap.impl.ElementImpl;

public class ILServiceImpl implements ILService {
	private final static Logger logger = LoggerFactory.getLogger(ILServiceImpl.class);
	private NewBusinessProposalGenerator newBusinessProposalGenerator;

	public ILServiceImpl() {
		newBusinessProposalGenerator = new NewBusinessProposalGenerator();
	}

	public String serviceRequest(String json) {
		logger.info("serviceRequest() start");
		NewBusinessModel newBusinessModel = policyObjectPopulator(json);
		String createClientSoapEnvelop = newBusinessProposalGenerator.buildCreateClientRequest(newBusinessModel);
		logger.info("=========Create Client Soap Envelop=========");
		SOAPBody clientResponseSoapBody = invokeILSoapService(createClientSoapEnvelop, IntegrationConstants.CLIENT_URL);
		String clientNumber = getClientNumberFromSoapBody(clientResponseSoapBody);
		logger.info("=====Cleint Number :: [{}]",clientNumber);
		setClientIdToNewBusinessObject(newBusinessModel, clientNumber);
		String newBusinessSoapEnvelop = newBusinessProposalGenerator.buildNewBusinessProposalRequest(newBusinessModel);
		logger.info("=========NewBusinessProposal Soap Envelop=========");
		SOAPBody nbsResponseSoapBody = invokeILSoapService(newBusinessSoapEnvelop,
				IntegrationConstants.NEW_BUSINESS_URL);
		String nbsContractNum = getNBSContractNummberFromSoapBody(nbsResponseSoapBody);
		logger.info("=====NewBusinessProposal Contract Number :: [{}]", nbsContractNum);
		logger.info("serviceRequest() end before return");
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
		logger.info("policyObjectPopulator() start");
		ObjectMapper mapper = new ObjectMapper();
		NewBusinessModel newBusinessModel = null;
		try {
			newBusinessModel = mapper.readValue(json, NewBusinessModel.class);
		} catch (IOException e) {
			logger.error("error while policyObjectPopulator() :: {}",e);
		}
		logger.info("policyObjectPopulator() end before return");
		return newBusinessModel;
	}

	private SOAPBody invokeILSoapService(String soapEnvelop, String url) {
		logger.info("invokeILSoapService() start");
		SOAPMessage response = null;
		try {
			SOAPConnectionFactory sfc = SOAPConnectionFactory.newInstance();
			SOAPConnection connection = sfc.createConnection();
			InputStream is = new ByteArrayInputStream(soapEnvelop.getBytes());
			SOAPMessage request = MessageFactory.newInstance().createMessage(null, is);
			logger.info("\n Soap Request:\n");
			ByteArrayOutputStream bout = new ByteArrayOutputStream();   
			request.writeTo(bout);
			logger.info(bout.toString("UTF-8"));
			bout.close();
			URL endpoint = new URL(url);
			response = connection.call(request, endpoint);
			logger.info("\n Soap Response=========:\n");
			bout = new ByteArrayOutputStream();
			response.writeTo(bout);
			logger.info(bout.toString("UTF-8"));
			bout.close();
			logger.info("invokeILSoapService() end before return");
			return response.getSOAPBody();
		} catch (Exception e) {
			logger.error("error while invokeILSoapService() :: {} ", e);
		}
		logger.info("invokeILSoapService() end");
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
}
