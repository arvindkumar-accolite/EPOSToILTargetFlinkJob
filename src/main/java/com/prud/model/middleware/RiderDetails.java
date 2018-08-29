package com.prud.model.middleware;

import java.math.BigDecimal;
import java.math.BigInteger;

public class RiderDetails {
	private String riderId;
	private String riderParent;
	private String mortalityClass;
	private BigInteger premiumCessationAge;
	private BigInteger premiumCessationTerm;
	private BigInteger riskCessationAge;
	private BigInteger riskCessationTerm;
	private BigInteger sumInsured;
	private BigDecimal coverageOrRiderInstalmentAmount;
	private String coverageOrRiderTable;

	public String getRiderId() {
		return riderId;
	}

	public void setRiderId(String riderId) {
		this.riderId = riderId;
	}

	public String getRiderParent() {
		return riderParent;
	}

	public void setRiderParent(String riderParent) {
		this.riderParent = riderParent;
	}

	public String getMortalityClass() {
		return mortalityClass;
	}

	public void setMortalityClass(String mortalityClass) {
		this.mortalityClass = mortalityClass;
	}

	public BigInteger getPremiumCessationAge() {
		return premiumCessationAge;
	}

	public void setPremiumCessationAge(BigInteger premiumCessationAge) {
		this.premiumCessationAge = premiumCessationAge;
	}

	public BigInteger getPremiumCessationTerm() {
		return premiumCessationTerm;
	}

	public void setPremiumCessationTerm(BigInteger premiumCessationTerm) {
		this.premiumCessationTerm = premiumCessationTerm;
	}

	public BigInteger getRiskCessationAge() {
		return riskCessationAge;
	}

	public void setRiskCessationAge(BigInteger riskCessationAge) {
		this.riskCessationAge = riskCessationAge;
	}

	public BigInteger getRiskCessationTerm() {
		return riskCessationTerm;
	}

	public void setRiskCessationTerm(BigInteger riskCessationTerm) {
		this.riskCessationTerm = riskCessationTerm;
	}

	public BigInteger getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(BigInteger sumInsured) {
		this.sumInsured = sumInsured;
	}

	public BigDecimal getCoverageOrRiderInstalmentAmount() {
		return coverageOrRiderInstalmentAmount;
	}

	public void setCoverageOrRiderInstalmentAmount(BigDecimal coverageOrRiderInstalmentAmount) {
		this.coverageOrRiderInstalmentAmount = coverageOrRiderInstalmentAmount;
	}

	public String getCoverageOrRiderTable() {
		return coverageOrRiderTable;
	}

	public void setCoverageOrRiderTable(String coverageOrRiderTable) {
		this.coverageOrRiderTable = coverageOrRiderTable;
	}

}
