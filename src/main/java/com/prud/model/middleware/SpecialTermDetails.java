package com.prud.model.middleware;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SpecialTermDetails {
	private String specialTermId;
	private String specialTermParent;
	private BigInteger ageRating;
	private BigInteger adjustmentDuration;
	private BigInteger rateAdjustment;
	private String adjustmentCode;
	private BigDecimal adjustmentPercentage;
	private String reassuranceIndicator;
	private String selectLineOfSubFile;

	public String getSpecialTermId() {
		return specialTermId;
	}

	public void setSpecialTermId(String specialTermId) {
		this.specialTermId = specialTermId;
	}

	public String getSpecialTermParent() {
		return specialTermParent;
	}

	public void setSpecialTermParent(String specialTermParent) {
		this.specialTermParent = specialTermParent;
	}

	public BigInteger getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(BigInteger ageRating) {
		this.ageRating = ageRating;
	}

	public BigInteger getAdjustmentDuration() {
		return adjustmentDuration;
	}

	public void setAdjustmentDuration(BigInteger adjustmentDuration) {
		this.adjustmentDuration = adjustmentDuration;
	}

	public BigInteger getRateAdjustment() {
		return rateAdjustment;
	}

	public void setRateAdjustment(BigInteger rateAdjustment) {
		this.rateAdjustment = rateAdjustment;
	}

	public String getAdjustmentCode() {
		return adjustmentCode;
	}

	public void setAdjustmentCode(String adjustmentCode) {
		this.adjustmentCode = adjustmentCode;
	}

	public BigDecimal getAdjustmentPercentage() {
		return adjustmentPercentage;
	}

	public void setAdjustmentPercentage(BigDecimal adjustmentPercentage) {
		this.adjustmentPercentage = adjustmentPercentage;
	}

	public String getReassuranceIndicator() {
		return reassuranceIndicator;
	}

	public void setReassuranceIndicator(String reassuranceIndicator) {
		this.reassuranceIndicator = reassuranceIndicator;
	}

	public String getSelectLineOfSubFile() {
		return selectLineOfSubFile;
	}

	public void setSelectLineOfSubFile(String selectLineOfSubFile) {
		this.selectLineOfSubFile = selectLineOfSubFile;
	}

}
