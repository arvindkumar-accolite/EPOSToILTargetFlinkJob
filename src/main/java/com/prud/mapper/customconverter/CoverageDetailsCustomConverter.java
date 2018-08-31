package com.prud.mapper.customconverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.prud.constant.IntegrationConstants;
import com.prud.model.il.NBSCRTIREC.NBSCRTICOVERAGEDETAILS;
import com.prud.model.il.NBSCRTIREC.NBSCRTICOVERAGEDETAILS.COVRPCESDTE;
import com.prud.model.il.NBSCRTIREC.NBSCRTICOVERAGEDETAILS.COVRRCESDTE;
import com.prud.model.il.NBSCRTIREC.NBSCRTICOVERAGEDETAILS.COVRRUNDTE;
import com.prud.model.middleware.CoverageDetails;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class CoverageDetailsCustomConverter extends CustomConverter<List<CoverageDetails>, List<NBSCRTICOVERAGEDETAILS>>{

	public List<NBSCRTICOVERAGEDETAILS> convert(List<CoverageDetails> source,
			Type<? extends List<NBSCRTICOVERAGEDETAILS>> destinationType) {
		if (null == source) {
			return null;
		}
		List<NBSCRTICOVERAGEDETAILS> targetCovDetails = new ArrayList<>();
		for (CoverageDetails coverageDetails : source) {
			NBSCRTICOVERAGEDETAILS targetCoverageDetails = new NBSCRTICOVERAGEDETAILS();
			targetCoverageDetails.setCOVERAGEENTID(coverageDetails.getCoverageId());
			targetCoverageDetails.setCOVERAGEPARENT(coverageDetails.getCoverageParent());
			targetCoverageDetails.setCOVRCRTABLE(coverageDetails.getCoverageOrRiderTable());
			targetCoverageDetails.setCovrinstprm(coverageDetails.getCoverageOrRiderInstalmentAmount());
			targetCoverageDetails.setCOVRLMPCNT(coverageDetails.getLumpSumContribution());
			targetCoverageDetails.setCovrmortcls(coverageDetails.getMortalityClass());
			targetCoverageDetails.setCOVRPCESDTE(convertCOVRPCESDate(coverageDetails.getPremiumCessationDate()));
			targetCoverageDetails.setCOVRPCESSAGE(coverageDetails.getPremiumCessationAge());
			targetCoverageDetails.setCOVRPCESSTRM(coverageDetails.getPremiumCessationTerm());
			targetCoverageDetails.setCOVRRCESDTE(convertRiskCessDate(coverageDetails.getRiskCessationDate()));
			targetCoverageDetails.setCOVRRCESSAGE(coverageDetails.getRiskCessationAge());
			targetCoverageDetails.setCOVRRCESSTRM(coverageDetails.getRiskCessationTerm());
			targetCoverageDetails.setCOVRRSUNIN(coverageDetails.getReserveUnitsIndicator());
			targetCoverageDetails.setCOVRRUNDTE(convertCOVRRUNDate(coverageDetails.getReserveUnitsAllocationDate()));
			targetCoverageDetails.setCovrsumin(coverageDetails.getSumInsured());
			targetCovDetails.add(targetCoverageDetails);
		}
		return targetCovDetails;
	}

	public COVRPCESDTE convertCOVRPCESDate(String source) {
		Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		COVRPCESDTE prmCesDate = new COVRPCESDTE();
		prmCesDate.setCCYY(String.valueOf(cal.get(Calendar.YEAR)));
		prmCesDate.setMM(String.format(IntegrationConstants.FORMAT_LENGTH_2, cal.get(Calendar.MONTH) + 1));
		prmCesDate.setDD(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return prmCesDate;
	}

	public COVRRCESDTE convertRiskCessDate(String source) {
		Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		COVRRCESDTE riskCessDate = new COVRRCESDTE();
		riskCessDate.setCCYY(String.valueOf(cal.get(Calendar.YEAR)));
		riskCessDate.setMM(String.format(IntegrationConstants.FORMAT_LENGTH_2, cal.get(Calendar.MONTH) + 1));
		riskCessDate.setDD(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return riskCessDate;
	}

	public COVRRUNDTE convertCOVRRUNDate(String source) {
		Date date = null;
		try {
			date = new SimpleDateFormat(IntegrationConstants.CLTDOBX_FORMAT).parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		COVRRUNDTE covDate = new COVRRUNDTE();
		covDate.setCCYY(String.valueOf(cal.get(Calendar.YEAR)));
		covDate.setMM(String.format(IntegrationConstants.FORMAT_LENGTH_2, cal.get(Calendar.MONTH) + 1));
		covDate.setDD(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
		return covDate;
	}

}
