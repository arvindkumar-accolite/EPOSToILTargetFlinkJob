package com.prud.mapper.impl;

import com.prud.model.jpath.ClientJpathModel;
import com.prud.model.middleware.ClientDetails;
import com.prud.translator.JsonValueExtractor;

public class ClientPopulator {
	private JsonValueExtractor extractor;
	private ClientJpathModel eposJpathModel = new ClientJpathModel();

	public ClientDetails buildClient(String content) {
		extractor = new JsonValueExtractor(content);
		ClientDetails clientDetails = new ClientDetails();
		clientDetails.setBirthPlace(extractor.fetchString(eposJpathModel.getCity()));
		clientDetails.setAddress01(extractor.fetchString(eposJpathModel.getAddress()));
		clientDetails.setPostalCode(extractor.fetchString(eposJpathModel.getZipcode()));
		clientDetails.setPhone01(extractor.fetchString(eposJpathModel.getPhone()));
		clientDetails.setGender(extractor.fetchString(eposJpathModel.getGender()));
		clientDetails.setCountryCode(extractor.fetchString(eposJpathModel.getCountryCode()));
		clientDetails.setGivenName(extractor.fetchString(eposJpathModel.getFirstName()));
		clientDetails.setSurName(extractor.fetchString(eposJpathModel.getLastName()));
		clientDetails.setMarriedIndicator(extractor.fetchString(eposJpathModel.getStatus()));
		clientDetails.setNationality(extractor.fetchString(eposJpathModel.getNationality()));
		clientDetails.setOccupationCode(extractor.fetchString(eposJpathModel.getOccupationCode()));
		clientDetails.setSalutaion(extractor.fetchString(eposJpathModel.getSalutation()));
		return clientDetails;
	}
}
