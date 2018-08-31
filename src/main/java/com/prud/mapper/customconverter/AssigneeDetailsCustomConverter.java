package com.prud.mapper.customconverter;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.prud.constant.IntegrationConstants;
import com.prud.model.il.NBSCRTIREC.ASSIGNEES.NBSCRTIASSIGNEEDETAILS;
import com.prud.model.il.NBSCRTIREC.ASSIGNEES.NBSCRTIASSIGNEEDETAILS.COMMFROM;
import com.prud.model.il.NBSCRTIREC.ASSIGNEES.NBSCRTIASSIGNEEDETAILS.COMMTO;
import com.prud.model.middleware.AssigneeDetails;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class AssigneeDetailsCustomConverter
		extends CustomConverter<List<AssigneeDetails>, List<NBSCRTIASSIGNEEDETAILS>> {

	public List<NBSCRTIASSIGNEEDETAILS> convert(List<AssigneeDetails> source,
			Type<? extends List<NBSCRTIASSIGNEEDETAILS>> destinationType) {
		if (null == source) {
			return null;
		}
		List<NBSCRTIASSIGNEEDETAILS> targetAssignee = new ArrayList<>();
		for (AssigneeDetails assigneeDetails : source) {
			NBSCRTIASSIGNEEDETAILS targetAssigneeDetails = new NBSCRTIASSIGNEEDETAILS();
			targetAssigneeDetails.setAssigneeparty(assigneeDetails.getAssigneeParty());
			targetAssigneeDetails.setReasoncd(assigneeDetails.getReasonCode());
			targetAssigneeDetails.setCommfrom(convertCOMMFROMDate(assigneeDetails.getCommissionFromDate()));
			targetAssigneeDetails.setCommto(convertCOMMTODate(assigneeDetails.getCommissionToDate()));
			targetAssignee.add(targetAssigneeDetails);
		}
		return targetAssignee;
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
		cltDOBX.setCcyy(BigInteger.valueOf(cal.get(Calendar.YEAR)));
		cltDOBX.setMm(BigInteger.valueOf(cal.get(Calendar.MONTH) + 1));
		cltDOBX.setDd(BigInteger.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
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
		cltDOBX.setCcyy(BigInteger.valueOf(cal.get(Calendar.YEAR)));
		cltDOBX.setMm(BigInteger.valueOf(cal.get(Calendar.MONTH) + 1));
		cltDOBX.setDd(BigInteger.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return cltDOBX;
	}

}
