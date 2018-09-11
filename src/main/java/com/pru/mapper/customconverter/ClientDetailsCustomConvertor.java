package com.pru.mapper.customconverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.pru.constant.IntegrationConstants;
import com.pru.model.il.NBSCRTIREC.NBSCRTICLIENT;
import com.pru.model.il.NBSCRTIREC.NBSCRTICLIENT.CLIENTCLTDOBX;
import com.pru.model.middleware.ClientDetails;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class ClientDetailsCustomConvertor extends CustomConverter<List<ClientDetails>, List<NBSCRTICLIENT>>
{
	public CLIENTCLTDOBX convertClientDobDate(String source) {
		Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		CLIENTCLTDOBX cltDOBX = new CLIENTCLTDOBX();
		cltDOBX.setCCYY(String.valueOf(cal.get(Calendar.YEAR)));
		cltDOBX.setMM(String.format(IntegrationConstants.FORMAT_LENGTH_2, cal.get(Calendar.MONTH) + 1));
		cltDOBX.setDD(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return cltDOBX;
	}

	public List<NBSCRTICLIENT> convert(List<ClientDetails> source,
			Type<? extends List<NBSCRTICLIENT>> destinationType) {
		if (null == source) {
			return null;
		}
		List<NBSCRTICLIENT> nbsClientList = new ArrayList<>();
		for (ClientDetails clientDetails : source) {
			NBSCRTICLIENT nbsClient = new NBSCRTICLIENT();
			nbsClient.setClientaddrtype(clientDetails.getAddressType());
			nbsClient.setClientclnttype(clientDetails.getClientType());
			nbsClient.setClientcltaddr01(clientDetails.getAddress01());
			nbsClient.setClientcltaddr02(clientDetails.getAddress02());
			nbsClient.setClientcltaddr03(clientDetails.getAddress03());
			nbsClient.setClientcltaddr04(clientDetails.getAddress04());
			nbsClient.setClientcltdobx(convertClientDobDate(clientDetails.getDateOfBirth()));
			nbsClient.setClientcltpcode(clientDetails.getPostalCode());
			nbsClient.setClientcltphone01(clientDetails.getPhone01());
			nbsClient.setClientcltphone02(clientDetails.getPhone02());
			nbsClient.setClientcltsex(clientDetails.getGender());
			nbsClient.setClientcorpname(clientDetails.getCorporateName());
			nbsClient.setClientdocno(clientDetails.getDocumentNumber());
			nbsClient.setClientemail(clientDetails.getEmail());
			nbsClient.setClientethorig(clientDetails.getEthnicOrigin());
			nbsClient.setClientfao(clientDetails.getForTheAttentionOf());
			nbsClient.setClientgivname(clientDetails.getGivenName());
			nbsClient.setClientlanguage(clientDetails.getLanguage());
			nbsClient.setClientmailing(clientDetails.getMailingIndicator());
			nbsClient.setClientmarryd(clientDetails.getMarriedIndicator());
			nbsClient.setClientmiddl01(clientDetails.getMiddleName01());
			nbsClient.setClientmiddl02(clientDetails.getMiddleName02());
			nbsClient.setClientnatlty(clientDetails.getNationality());
			nbsClient.setClientoccpcode(clientDetails.getOccupationCode());
			nbsClient.setClientprefcom(clientDetails.getPrefCom());
			nbsClient.setClientsalutl(clientDetails.getSalutation());
			nbsClient.setClientsecuityno(clientDetails.getSecurityNumber());
			nbsClient.setClientsoe(clientDetails.getSourceOfEvidence());
			nbsClient.setClientstatcode(clientDetails.getStatusCode());
			nbsClient.setClientsurname(clientDetails.getSurName());
			nbsClient.setClientvip(clientDetails.getVipIndicator());
			nbsClient.setClientclntnum(clientDetails.getClientNumber());
			nbsClient.setClientparty(clientDetails.getParty());
			nbsClient.setCliententid(clientDetails.getEntId());
			nbsClient.setClientbirthp(clientDetails.getBirthPlace());
			nbsClient.setClientctrycode(clientDetails.getCountryCode());
			nbsClient.setlientdirmail(clientDetails.getDirectMailIndicator());
			
			nbsClientList.add(nbsClient);
		}
		return nbsClientList;
	}

}
