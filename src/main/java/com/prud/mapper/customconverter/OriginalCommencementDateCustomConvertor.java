package com.prud.mapper.customconverter;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.prud.constant.IntegrationConstants;
import com.prud.model.il.NBSCRTIREC.NBSCRTICONTRACTHDRDETAILS.OCCDATE;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class OriginalCommencementDateCustomConvertor extends CustomConverter<String, OCCDATE> {

	public OCCDATE convert(String source, Type<? extends OCCDATE> destinationType) {
		Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		OCCDATE occDate = new OCCDATE();
		occDate.setCcyy(BigInteger.valueOf(cal.get(Calendar.YEAR)));
		occDate.setMm(BigInteger.valueOf(cal.get(Calendar.MONTH) + 1));
		occDate.setDd(BigInteger.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return occDate;
	}

}
