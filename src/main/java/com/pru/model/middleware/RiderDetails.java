
package com.pru.model.middleware;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "riderId",
    "riderParent",
    "mortalityClass",
    "premiumCessationAge",
    "premiumCessationTerm",
    "riskCessationAge",
    "riskCessationTerm",
    "sumInsured",
    "coverageOrRiderInstalmentAmount",
    "coverageOrRiderTable"
})
public class RiderDetails {

    @JsonProperty("riderId")
    private String riderId;
    @JsonProperty("riderParent")
    private String riderParent;
    @JsonProperty("mortalityClass")
    private String mortalityClass;
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
    
    @JsonProperty("riderId")
    public String getRiderId() {
        return riderId;
    }

    @JsonProperty("riderId")
    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    @JsonProperty("riderParent")
    public String getRiderParent() {
        return riderParent;
    }

    @JsonProperty("riderParent")
    public void setRiderParent(String riderParent) {
        this.riderParent = riderParent;
    }

    @JsonProperty("mortalityClass")
    public String getMortalityClass() {
        return mortalityClass;
    }

    @JsonProperty("mortalityClass")
    public void setMortalityClass(String mortalityClass) {
        this.mortalityClass = mortalityClass;
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
}
