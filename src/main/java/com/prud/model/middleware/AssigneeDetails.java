package com.prud.model.middleware;

import java.math.BigInteger;

public class AssigneeDetails {
	private String assigneeParty;
	private BigInteger commissionFromDate;
	private BigInteger commissionToDate;
	private String reasonCode;

	public String getAssigneeParty() {
		return assigneeParty;
	}

	public void setAssigneeParty(String assigneeParty) {
		this.assigneeParty = assigneeParty;
	}

	public BigInteger getCommissionFromDate() {
		return commissionFromDate;
	}

	public void setCommissionFromDate(BigInteger commissionFromDate) {
		this.commissionFromDate = commissionFromDate;
	}

	public BigInteger getCommissionToDate() {
		return commissionToDate;
	}

	public void setCommissionToDate(BigInteger commissionToDate) {
		this.commissionToDate = commissionToDate;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
}
