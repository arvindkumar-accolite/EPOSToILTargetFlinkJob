package com.prud.model.middleware;

import java.math.BigInteger;

public class MandateDetails {
	private String mandateId;
	private String clientNumber;
	private String mandateRefNumber;
	private String bankAccountKey;
	private String bankKey;
	private BigInteger effectiveDate;
	private String factoringHouse;
	private String mandateStatus;
	private BigInteger timesToUse;

	public String getMandateId() {
		return mandateId;
	}

	public void setMandateId(String mandateId) {
		this.mandateId = mandateId;
	}

	public String getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getMandateRefNumber() {
		return mandateRefNumber;
	}

	public void setMandateRefNumber(String mandateRefNumber) {
		this.mandateRefNumber = mandateRefNumber;
	}

	public String getBankAccountKey() {
		return bankAccountKey;
	}

	public void setBankAccountKey(String bankAccountKey) {
		this.bankAccountKey = bankAccountKey;
	}

	public String getBankKey() {
		return bankKey;
	}

	public void setBankKey(String bankKey) {
		this.bankKey = bankKey;
	}

	public BigInteger getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(BigInteger effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getFactoringHouse() {
		return factoringHouse;
	}

	public void setFactoringHouse(String factoringHouse) {
		this.factoringHouse = factoringHouse;
	}

	public String getMandateStatus() {
		return mandateStatus;
	}

	public void setMandateStatus(String mandateStatus) {
		this.mandateStatus = mandateStatus;
	}

	public BigInteger getTimesToUse() {
		return timesToUse;
	}

	public void setTimesToUse(BigInteger timesToUse) {
		this.timesToUse = timesToUse;
	}

}
