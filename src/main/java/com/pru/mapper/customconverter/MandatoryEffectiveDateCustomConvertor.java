package com.pru.mapper.customconverter;

import com.pru.model.il.NBSCRTIREC.NBSCRTIMANDATEDETAILS.EFFDATEN264679;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class MandatoryEffectiveDateCustomConvertor extends CustomConverter<String, EFFDATEN264679> {

	public EFFDATEN264679 convert(String source, Type<? extends EFFDATEN264679> destinationType) {
		/*Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);*/

		EFFDATEN264679 effDate = new EFFDATEN264679();
		/*effDate.setCCYY(String.valueOf(cal.get(Calendar.YEAR)));
		effDate.setMM(String.format(IntegrationConstants.FORMAT_LENGTH_2, cal.get(Calendar.MONTH) + 1));
		effDate.setDD(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		*/
		effDate.setCCYY("9999");
		effDate.setMM("99");
		effDate.setDD("99");
		return effDate;
	}

}
