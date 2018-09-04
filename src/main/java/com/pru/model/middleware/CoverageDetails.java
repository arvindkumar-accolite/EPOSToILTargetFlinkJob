
package com.pru.model.middleware;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coverageId",
    "coverageParent",
    "mortalityClass",
    "riskCessationDate",
    "premiumCessationDate",
    "premiumCessationAge",
    "premiumCessationTerm",
    "riskCessationAge",
    "riskCessationTerm",
    "sumInsured",
    "coverageOrRiderInstalmentAmount",
    "coverageOrRiderTable",
    "lumpSumContribution",
    "reserveUnitsAllocationDate",
    "reserveUnitsIndicator"
})
public class CoverageDetails {

    @JsonProperty("coverageId")
    private String coverageId;
    @JsonProperty("coverageParent")
    private String coverageParent;
    @JsonProperty("mortalityClass")
    private String mortalityClass;
    @JsonProperty("riskCessationDate")
    private String riskCessationDate;
    @JsonProperty("premiumCessationDate")
    private String premiumCessationDate;
    @JsonProperty("premiumCessationAge")
    private BigInteger premiumCessationAge;
    @JsonProperty("premiumCessationTerm")
    private BigInteger premiumCessationTerm;
    @JsonProperty("riskCessationAge")
    private BigInteger riskCessationAge;
    @JsonProperty("riskCessationTerm")
    private BigInteger riskCessationTerm;
    @JsonProperty("sumInsured")
    private BigInteger sumInsured;
    @JsonProperty("coverageOrRiderInstalmentAmount")
    private BigDecimal coverageOrRiderInstalmentAmount;
    @JsonProperty("coverageOrRiderTable")
    private String coverageOrRiderTable;
    @JsonProperty("lumpSumContribution")
    private BigDecimal lumpSumContribution;
    @JsonProperty("reserveUnitsAllocationDate")
    private String reserveUnitsAllocationDate;
    @JsonProperty("reserveUnitsIndicator")
    private String reserveUnitsIndicator;
  
    @JsonProperty("coverageId")
    public String getCoverageId() {
        return coverageId;
    }

    @JsonProperty("coverageId")
    public void setCoverageId(String coverageId) {
        this.coverageId = coverageId;
    }

    @JsonProperty("coverageParent")
    public String getCoverageParent() {
        return coverageParent;
    }

    @JsonProperty("coverageParent")
    public void setCoverageParent(String coverageParent) {
        this.coverageParent = coverageParent;
    }

    @JsonProperty("mortalityClass")
    public String getMortalityClass() {
        return mortalityClass;
    }

    @JsonProperty("mortalityClass")
    public void setMortalityClass(String mortalityClass) {
        this.mortalityClass = mortalityClass;
    }

    @JsonProperty("riskCessationDate")
    public String getRiskCessationDate() {
        return riskCessationDate;
    }

    @JsonProperty("riskCessationDate")
    public void setRiskCessationDate(String riskCessationDate) {
        this.riskCessationDate = riskCessationDate;
    }

    @JsonProperty("premiumCessationDate")
    public String getPremiumCessationDate() {
        return premiumCessationDate;
    }

    @JsonProperty("premiumCessationDate")
    public void setPremiumCessationDate(String premiumCessationDate) {
        this.premiumCessationDate = premiumCessationDate;
    }

    @JsonProperty("premiumCessationAge")
    public BigInteger getPremiumCessationAge() {
        return premiumCessationAge;
    }

    @JsonProperty("premiumCessationAge")
    public void setPremiumCessationAge(BigInteger premiumCessationAge) {
        this.premiumCessationAge = premiumCessationAge;
    }

    @JsonProperty("premiumCessationTerm")
    public BigInteger getPremiumCessationTerm() {
        return premiumCessationTerm;
    }

    @JsonProperty("premiumCessationTerm")
    public void setPremiumCessationTerm(BigInteger premiumCessationTerm) {
        this.premiumCessationTerm = premiumCessationTerm;
    }

    @JsonProperty("riskCessationAge")
    public BigInteger getRiskCessationAge() {
        return riskCessationAge;
    }

    @JsonProperty("riskCessationAge")
    public void setRiskCessationAge(BigInteger riskCessationAge) {
        this.riskCessationAge = riskCessationAge;
    }

    @JsonProperty("riskCessationTerm")
    public BigInteger getRiskCessationTerm() {
        return riskCessationTerm;
    }

    @JsonProperty("riskCessationTerm")
    public void setRiskCessationTerm(BigInteger riskCessationTerm) {
        this.riskCessationTerm = riskCessationTerm;
    }

    @JsonProperty("sumInsured")
    public BigInteger getSumInsured() {
        return sumInsured;
    }

    @JsonProperty("sumInsured")
    public void setSumInsured(BigInteger sumInsured) {
        this.sumInsured = sumInsured;
    }

    @JsonProperty("coverageOrRiderInstalmentAmount")
    public BigDecimal getCoverageOrRiderInstalmentAmount() {
        return coverageOrRiderInstalmentAmount;
    }

    @JsonProperty("coverageOrRiderInstalmentAmount")
    public void setCoverageOrRiderInstalmentAmount(BigDecimal coverageOrRiderInstalmentAmount) {
        this.coverageOrRiderInstalmentAmount = coverageOrRiderInstalmentAmount;
    }

    @JsonProperty("coverageOrRiderTable")
    public String getCoverageOrRiderTable() {
        return coverageOrRiderTable;
    }

    @JsonProperty("coverageOrRiderTable")
    public void setCoverageOrRiderTable(String coverageOrRiderTable) {
        this.coverageOrRiderTable = coverageOrRiderTable;
    }

    @JsonProperty("lumpSumContribution")
    public BigDecimal getLumpSumContribution() {
        return lumpSumContribution;
    }

    @JsonProperty("lumpSumContribution")
    public void setLumpSumContribution(BigDecimal lumpSumContribution) {
        this.lumpSumContribution = lumpSumContribution;
    }

    @JsonProperty("reserveUnitsAllocationDate")
    public String getReserveUnitsAllocationDate() {
        return reserveUnitsAllocationDate;
    }

    @JsonProperty("reserveUnitsAllocationDate")
    public void setReserveUnitsAllocationDate(String reserveUnitsAllocationDate) {
        this.reserveUnitsAllocationDate = reserveUnitsAllocationDate;
    }

    @JsonProperty("reserveUnitsIndicator")
    public String getReserveUnitsIndicator() {
        return reserveUnitsIndicator;
    }

    @JsonProperty("reserveUnitsIndicator")
    public void setReserveUnitsIndicator(String reserveUnitsIndicator) {
        this.reserveUnitsIndicator = reserveUnitsIndicator;
    }
}
