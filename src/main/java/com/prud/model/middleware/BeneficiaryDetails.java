package com.prud.model.middleware;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BeneficiaryDetails {
	private String beneficiaryParty;
	private BigDecimal beneficiaryPercentage;
	private String beneficiaryClientNumber;
	private String beneficiaryType;
	private String clientRelationship;
	private BigInteger effectiveDate;

	public String getBeneficiaryParty() {
		return beneficiaryParty;
	}

	public void setBeneficiaryParty(String beneficiaryParty) {
		this.beneficiaryParty = beneficiaryParty;
	}

	public BigDecimal getBeneficiaryPercentage() {
		return beneficiaryPercentage;
	}

	public void setBeneficiaryPercentage(BigDecimal beneficiaryPercentage) {
		this.beneficiaryPercentage = beneficiaryPercentage;
	}

	public String getBeneficiaryClientNumber() {
		return beneficiaryClientNumber;
	}

	public void setBeneficiaryClientNumber(String beneficiaryClientNumber) {
		this.beneficiaryClientNumber = beneficiaryClientNumber;
	}

	public String getBeneficiaryType() {
		return beneficiaryType;
	}

	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}

	public String getClientRelationship() {
		return clientRelationship;
	}

	public void setClientRelationship(String clientRelationship) {
		this.clientRelationship = clientRelationship;
	}

	public BigInteger getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(BigInteger effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

}
