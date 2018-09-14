package com.pru.mapper.customconverter;

import java.util.ArrayList;
import java.util.List;

import com.pru.model.il.NBSCRTIREC.BENEFICIARY.NBSCRTIBENDETAILS;
import com.pru.model.il.NBSCRTIREC.BENEFICIARY.NBSCRTIBENDETAILS.EFFDATE;
import com.pru.model.middleware.BeneficiaryDetails;

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
		/*Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
*/
		EFFDATE effDate = new EFFDATE();
		/*effDate.setCCYY(String.valueOf(cal.get(Calendar.YEAR)));
		effDate.setMM(String.format(IntegrationConstants.FORMAT_LENGTH_2,cal.get(Calendar.MONTH) + 1));
		effDate.setDD(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));*/
		effDate.setCCYY("9999");
		effDate.setMM("99");
		effDate.setDD("99");
		return effDate;
	}

}
