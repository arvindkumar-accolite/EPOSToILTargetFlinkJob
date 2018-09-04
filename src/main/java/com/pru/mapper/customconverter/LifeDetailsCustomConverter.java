package com.pru.mapper.customconverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.pru.constant.IntegrationConstants;
import com.pru.model.il.NBSCRTIREC.NBSCRTILIVES;
import com.pru.model.il.NBSCRTIREC.NBSCRTILIVES.DOB;
import com.pru.model.middleware.LifeDetails;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class LifeDetailsCustomConverter extends CustomConverter<List<LifeDetails>, List<NBSCRTILIVES>>{

	public List<NBSCRTILIVES> convert(List<LifeDetails> source,
			Type<? extends List<NBSCRTILIVES>> destinationType) {
		if (null == source) {
			return null;
		}
		List<NBSCRTILIVES> targetlifeDetails = new ArrayList<>();
		for (LifeDetails lifeDetails : source) {
			NBSCRTILIVES targetlifeDetail = new NBSCRTILIVES();
			targetlifeDetail.setANBAGE(lifeDetails.getAnbAge());
			targetlifeDetail.setDOB(convertDob(lifeDetails.getDateOfBirth()));
			targetlifeDetail.setHEIGHT(lifeDetails.getHeight());
			targetlifeDetail.setLIFEENTID(lifeDetails.getLifeId());
			targetlifeDetail.setLIFEPARTY(lifeDetails.getLifeParty());
			targetlifeDetail.setOCCUP(lifeDetails.getOccupationCode());
			targetlifeDetail.setRELATION(lifeDetails.getRelationshipToLifeInsured());
			targetlifeDetail.setSELECTION(lifeDetails.getSelection());
			targetlifeDetail.setSEX(lifeDetails.getSex());
			targetlifeDetail.setSMOKING(lifeDetails.getSmokingIndicator());
			targetlifeDetail.setWEIGHT(lifeDetails.getWeight());
			targetlifeDetails.add(targetlifeDetail);
		}
		return targetlifeDetails;
	}
	
	public DOB convertDob(String source) {
		Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		DOB dob = new DOB();
		dob.setCCYY(String.valueOf(cal.get(Calendar.YEAR)));
		dob.setMM(String.format(IntegrationConstants.FORMAT_LENGTH_2, cal.get(Calendar.MONTH) + 1));
		dob.setDD(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return dob;
	}
}
