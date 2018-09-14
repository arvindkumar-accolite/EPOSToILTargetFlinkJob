package com.pru.mapper.customconverter;

import com.pru.model.il.NBSCRTIREC.NBSCRTIPREMIUMRCTDETAILS.TRANDATEX;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class PreminumTransactionDateCustomConvertor extends CustomConverter<String, TRANDATEX> {

	public TRANDATEX convert(String source, Type<? extends TRANDATEX> destinationType) {
		/*Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);*/

		TRANDATEX tranDate = new TRANDATEX();
		/*tranDate.setCCYY(String.valueOf(cal.get(Calendar.YEAR)));
		tranDate.setMM(String.format(IntegrationConstants.FORMAT_LENGTH_2, cal.get(Calendar.MONTH) + 1));
		tranDate.setDD(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		*/
		tranDate.setCCYY("9999");
		tranDate.setMM("99");
		tranDate.setDD("99");
		return tranDate;
	}

}
