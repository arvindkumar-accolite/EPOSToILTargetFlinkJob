package com.pru.mapper.customconverter;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.pru.constant.IntegrationConstants;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class ProposalDateCustomConvertor extends CustomConverter<String, BigInteger> {

	@Override
	public BigInteger convert(String source, Type<? extends BigInteger> destinationType) {
		String date = null;
		SimpleDateFormat sdf = null;
		SimpleDateFormat sdf1 = null;
		try {
			sdf = new SimpleDateFormat(IntegrationConstants.DATE_FORMAT_YYYYMMDD);
			sdf1 = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT);
			date = sdf.format(sdf1.parse(source));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BigInteger(date);
	}
}