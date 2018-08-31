package com.prud.mapper.customconverter;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.prud.constant.IntegrationConstants;
import com.prud.model.il.NBSCRTIREC.NBSCRTIMANDATEDETAILS.EFFDATE;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class MandatoryEffectiveDateCustomConvertor extends CustomConverter<String, EFFDATE> {

	public EFFDATE convert(String source, Type<? extends EFFDATE> destinationType) {
		Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		EFFDATE effDate = new EFFDATE();
		effDate.setCCYY(BigInteger.valueOf(cal.get(Calendar.YEAR)));
		effDate.setMM(BigInteger.valueOf(cal.get(Calendar.MONTH) + 1));
		effDate.setDD(BigInteger.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return effDate;
	}

}
