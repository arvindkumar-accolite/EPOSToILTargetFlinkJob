package com.prud.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import com.prud.model.il.NBSCRTIREC;
import com.prud.model.il.NBSCRTIREC.ASSIGNEES.NBSCRTIASSIGNEEDETAILS;
import com.prud.model.il.NBSCRTIREC.BENEFICIARY.NBSCRTIBENDETAILS;
import com.prud.model.middleware.AssigneeDetails;
import com.prud.model.middleware.BeneficiaryDetails;

import ma.glasnost.orika.metadata.Type;

public class BeneficiaryDetailsCustomConverter {
	
	public List<NBSCRTIASSIGNEEDETAILS> convert(List<BeneficiaryDetails> source, Type<? extends List<NBSCRTIBENDETAILS>> destinationType) {
		if(null==source) {
			return null;
		}
		List<NBSCRTIASSIGNEEDETAILS> targetAssignee = new ArrayList<>();
		for(AssigneeDetails assigneeDetails : source) {
			NBSCRTIASSIGNEEDETAILS targetAssigneeDetails = new NBSCRTIASSIGNEEDETAILS();
			targetAssigneeDetails.setASSIGNEEPARTY(assigneeDetails.getAssigneeParty());
			targetAssigneeDetails.setREASONCD(assigneeDetails.getReasonCode());
			targetAssigneeDetails.setCOMMFROM(convertCOMMFROMDate(assigneeDetails.getCommissionFromDate()));
			targetAssigneeDetails.setCOMMTO(convertCOMMTODate(assigneeDetails.getCommissionToDate()));
			targetAssignee.add(targetAssigneeDetails);
		}
		return targetAssignee;
	}

}
