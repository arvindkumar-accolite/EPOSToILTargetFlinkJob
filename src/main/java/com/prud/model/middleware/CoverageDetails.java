package com.prud.model.middleware;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CoverageDetails {
	private String coverageId;
	private String coverageParent;
	private String mortalityClass;
	private BigInteger riskCessationDate;
	private BigInteger premiumCessationDate;
	private BigInteger premiumCessationAge;
	private BigInteger premiumCessationTerm;
	private BigInteger riskCessationAge;
	private BigInteger riskCessationTerm;
	private BigInteger sumInsured;
	private BigDecimal coverageOrRiderInstalmentAmount;
	private String coverageOrRiderTable;
	private BigDecimal lumpSumContribution;
	private String ReserveUnitsIndicator;
	private BigInteger ReserveUnitsAllocationDate;

	public String getCoverageId() {
		return coverageId;
	}

	public void setCoverageId(String coverageId) {
		this.coverageId = coverageId;
	}

	public String getCoverageParent() {
		return coverageParent;
	}

	public void setCoverageParent(String coverageParent) {
		this.coverageParent = coverageParent;
	}

	public String getMortalityClass() {
		return mortalityClass;
	}

	public void setMortalityClass(String mortalityClass) {
		this.mortalityClass = mortalityClass;
	}

	public BigInteger getRiskCessationDate() {
		return riskCessationDate;
	}

	public void setRiskCessationDate(BigInteger riskCessationDate) {
		this.riskCessationDate = riskCessationDate;
	}

	public BigInteger getPremiumCessationDate() {
		return premiumCessationDate;
	}

	public void setPremiumCessationDate(BigInteger premiumCessationDate) {
		this.premiumCessationDate = premiumCessationDate;
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

	public BigDecimal getLumpSumContribution() {
		return lumpSumContribution;
	}

	public void setLumpSumContribution(BigDecimal lumpSumContribution) {
		this.lumpSumContribution = lumpSumContribution;
	}

	public String getReserveUnitsIndicator() {
		return ReserveUnitsIndicator;
	}

	public void setReserveUnitsIndicator(String reserveUnitsIndicator) {
		ReserveUnitsIndicator = reserveUnitsIndicator;
	}

	public BigInteger getReserveUnitsAllocationDate() {
		return ReserveUnitsAllocationDate;
	}

	public void setReserveUnitsAllocationDate(BigInteger reserveUnitsAllocationDate) {
		ReserveUnitsAllocationDate = reserveUnitsAllocationDate;
	}
}
