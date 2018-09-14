package com.pru.mapper.customconverter;

import com.pru.model.il.NBSCRTIREC.NBSCRTICONTRACTHDRDETAILS.BILLCD;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class BillingRenewalDateCustomConverter extends CustomConverter<String, BILLCD> {

	public BILLCD convert(String source, Type<? extends BILLCD> destinationType) {
		/*Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);*/

		BILLCD bRenDate = new BILLCD();
		/*bRenDate.setCCYY(String.valueOf(cal.get(Calendar.YEAR)));
		bRenDate.setMM(String.format(IntegrationConstants.FORMAT_LENGTH_2, cal.get(Calendar.MONTH) + 1));
		bRenDate.setDD(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));*/
		bRenDate.setCCYY("9999");
		bRenDate.setMM("99");
		bRenDate.setDD("99");
		return bRenDate;
	}
}
