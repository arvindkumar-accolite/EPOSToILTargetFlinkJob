package com.prud.mapper.customconverter;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.prud.constant.IntegrationConstants;
import com.prud.model.il.NBSCRTIREC.NBSCRTIPREMIUMRCTDETAILS.TRANDATEX;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class PreminumTransactionDateCustomConvertor extends CustomConverter<String, TRANDATEX> {

	@Override
	public TRANDATEX convert(String source, Type<? extends TRANDATEX> destinationType) {
		Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		TRANDATEX tranDate = new TRANDATEX();
		tranDate.setCCYY(BigInteger.valueOf(cal.get(Calendar.YEAR)));
		tranDate.setMM(BigInteger.valueOf(cal.get(Calendar.MONTH) + 1));
		tranDate.setDD(BigInteger.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return tranDate;
	}

}
