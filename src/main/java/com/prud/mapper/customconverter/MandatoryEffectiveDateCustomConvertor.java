package com.prud.mapper.customconverter;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.prud.constant.IntegrationConstants;
import com.prud.model.il.NBSCRTIREC.NBSCRTIMANDATEDETAILS.EFFDATEN264679;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class MandatoryEffectiveDateCustomConvertor extends CustomConverter<String, EFFDATEN264679> {

	public EFFDATEN264679 convert(String source, Type<? extends EFFDATEN264679> destinationType) {
		Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		EFFDATEN264679 effDate = new EFFDATEN264679();
		effDate.setCCYY(BigInteger.valueOf(cal.get(Calendar.YEAR)));
		effDate.setMM(BigInteger.valueOf(cal.get(Calendar.MONTH) + 1));
		effDate.setDD(BigInteger.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return effDate;
	}

}
