package com.prud.mapper.customconverter;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.prud.constant.IntegrationConstants;
import com.prud.model.il.CLICRPIREC;
import com.prud.model.il.CLICRPIREC.CLTDOBX;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class ClientDOBCustomConverter extends CustomConverter<String, CLTDOBX> {

	public CLTDOBX convert(String source, Type<? extends CLTDOBX> destinationType) {
		Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		CLTDOBX cltDOBX = new CLTDOBX();
		cltDOBX.setCCYY(BigInteger.valueOf(cal.get(Calendar.YEAR)));
		cltDOBX.setMM(BigInteger.valueOf(cal.get(Calendar.MONTH) + 1));
		cltDOBX.setDD(BigInteger.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return cltDOBX;
	}

}
