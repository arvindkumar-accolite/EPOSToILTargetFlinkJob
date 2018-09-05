package com.pru.mapper.customconverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.pru.constant.IntegrationConstants;
import com.pru.model.il.NBSCRTIREC.NBSCRTIRIDERDETAILS;
import com.pru.model.il.NBSCRTIREC.ASSIGNEES.NBSCRTIASSIGNEEDETAILS.COMMFROM;
import com.pru.model.il.NBSCRTIREC.ASSIGNEES.NBSCRTIASSIGNEEDETAILS.COMMTO;
import com.pru.model.middleware.RiderDetails;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class RiderDetailsCustomConverter extends CustomConverter<List<RiderDetails>, List<NBSCRTIRIDERDETAILS>> {

	public List<NBSCRTIRIDERDETAILS> convert(List<RiderDetails> source,
			Type<? extends List<NBSCRTIRIDERDETAILS>> destinationType) {
		if (null == source) {
			return null;
		}
		List<NBSCRTIRIDERDETAILS> targetRiders = new ArrayList<>();
		for (RiderDetails riderDetails : source) {
			NBSCRTIRIDERDETAILS targetRiderDetails = new NBSCRTIRIDERDETAILS();
			targetRiderDetails.setRIDERENTID(riderDetails.getRiderId());
			targetRiderDetails.setRIDERPARENT(riderDetails.getRiderParent());
			targetRiderDetails.setCOVRCRTABLE(riderDetails.getCoverageOrRiderTable());
			targetRiderDetails.setCOVRINSTPRM(riderDetails.getCoverageOrRiderInstalmentAmount());
			targetRiderDetails.setCOVRMORTCLS(riderDetails.getMortalityClass());
			targetRiderDetails.setCOVRPCESSAGE(riderDetails.getPremiumCessationAge());
			targetRiderDetails.setCOVRPCESSTRM(riderDetails.getPremiumCessationTerm());
			targetRiderDetails.setCOVRSUMIN(riderDetails.getSumInsured());
			targetRiders.add(targetRiderDetails);
		}
		return targetRiders;
	}

	public COMMFROM convertCOMMFROMDate(String source) {
		Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		COMMFROM cltDOBX = new COMMFROM();
		cltDOBX.setCcyy(String.valueOf(cal.get(Calendar.YEAR)));
		cltDOBX.setMm(String.format(IntegrationConstants.FORMAT_LENGTH_2, cal.get(Calendar.MONTH) + 1));
		cltDOBX.setDd(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return cltDOBX;
	}

	public COMMTO convertCOMMTODate(String source) {
		Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		COMMTO cltDOBX = new COMMTO();
		cltDOBX.setCcyy(String.valueOf(cal.get(Calendar.YEAR)));
		cltDOBX.setMm(String.format(IntegrationConstants.FORMAT_LENGTH_2, cal.get(Calendar.MONTH) + 1));
		cltDOBX.setDd(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return cltDOBX;
	}

}
