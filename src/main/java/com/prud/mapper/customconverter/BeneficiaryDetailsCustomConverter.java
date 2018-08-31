package com.prud.mapper.customconverter;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.prud.constant.IntegrationConstants;
import com.prud.model.il.NBSCRTIREC.BENEFICIARY.NBSCRTIBENDETAILS;
import com.prud.model.il.NBSCRTIREC.BENEFICIARY.NBSCRTIBENDETAILS.EFFDATE;
import com.prud.model.middleware.BeneficiaryDetails;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class BeneficiaryDetailsCustomConverter extends CustomConverter<List<BeneficiaryDetails>, List<NBSCRTIBENDETAILS>>{

	public List<NBSCRTIBENDETAILS> convert(List<BeneficiaryDetails> source,
			Type<? extends List<NBSCRTIBENDETAILS>> destinationType) {
		if (null == source) {
			return null;
		}
		List<NBSCRTIBENDETAILS> targetBeneficiary = new ArrayList<>();
		for (BeneficiaryDetails beneficiaryDetails : source) {
			NBSCRTIBENDETAILS targetBeneficiaryDetails = new NBSCRTIBENDETAILS();
			targetBeneficiaryDetails.setBeneficiaryparty(beneficiaryDetails.getBeneficiaryParty());
			targetBeneficiaryDetails.setBnypc(beneficiaryDetails.getBeneficiaryPercentage());
			targetBeneficiaryDetails.setBnysel(beneficiaryDetails.getBeneficiaryClientNumber());
			targetBeneficiaryDetails.setBnytype(beneficiaryDetails.getBeneficiaryType());
			targetBeneficiaryDetails.setCltreln(beneficiaryDetails.getClientRelationship());
			targetBeneficiaryDetails.setEffdate(convertEffDate(beneficiaryDetails.getEffectiveDate()));
			targetBeneficiary.add(targetBeneficiaryDetails);
		}
		return targetBeneficiary;
	}

	public EFFDATE convertEffDate(String source) {
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
