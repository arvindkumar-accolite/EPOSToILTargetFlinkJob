
package com.pru.model.middleware;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "specialTermId",
    "specialTermParent",
    "ageRating",
    "adjustmentDuration",
    "rateAdjustment",
    "adjustmentCode",
    "adjustmentPercentage",
    "reassuranceIndicator",
    "selectLineOfSubFile"
})
public class SpecialTermDetails {

    @JsonProperty("specialTermId")
    private String specialTermId;
    @JsonProperty("specialTermParent")
    private String specialTermParent;
    @JsonProperty("ageRating")
    private BigInteger ageRating;
    @JsonProperty("adjustmentDuration")
    private BigInteger adjustmentDuration;
    @JsonProperty("rateAdjustment")
    private BigInteger rateAdjustment;
    @JsonProperty("adjustmentCode")
    private String adjustmentCode;
    @JsonProperty("adjustmentPercentage")
    private BigDecimal adjustmentPercentage;
    @JsonProperty("reassuranceIndicator")
    private String reassuranceIndicator;
    @JsonProperty("selectLineOfSubFile")
    private String selectLineOfSubFile;
   
    @JsonProperty("specialTermId")
    public String getSpecialTermId() {
        return specialTermId;
    }

    @JsonProperty("specialTermId")
    public void setSpecialTermId(String specialTermId) {
        this.specialTermId = specialTermId;
    }

    @JsonProperty("specialTermParent")
    public String getSpecialTermParent() {
        return specialTermParent;
    }

    @JsonProperty("specialTermParent")
    public void setSpecialTermParent(String specialTermParent) {
        this.specialTermParent = specialTermParent;
    }

    @JsonProperty("ageRating")
    public BigInteger getAgeRating() {
        return ageRating;
    }

    @JsonProperty("ageRating")
    public void setAgeRating(BigInteger ageRating) {
        this.ageRating = ageRating;
    }

    @JsonProperty("adjustmentDuration")
    public BigInteger getAdjustmentDuration() {
        return adjustmentDuration;
    }

    @JsonProperty("adjustmentDuration")
    public void setAdjustmentDuration(BigInteger adjustmentDuration) {
        this.adjustmentDuration = adjustmentDuration;
    }

    @JsonProperty("rateAdjustment")
    public BigInteger getRateAdjustment() {
        return rateAdjustment;
    }

    @JsonProperty("rateAdjustment")
    public void setRateAdjustment(BigInteger rateAdjustment) {
        this.rateAdjustment = rateAdjustment;
    }

    @JsonProperty("adjustmentCode")
    public String getAdjustmentCode() {
        return adjustmentCode;
    }

    @JsonProperty("adjustmentCode")
    public void setAdjustmentCode(String adjustmentCode) {
        this.adjustmentCode = adjustmentCode;
    }

    @JsonProperty("adjustmentPercentage")
    public BigDecimal getAdjustmentPercentage() {
        return adjustmentPercentage;
    }

    @JsonProperty("adjustmentPercentage")
    public void setAdjustmentPercentage(BigDecimal adjustmentPercentage) {
        this.adjustmentPercentage = adjustmentPercentage;
    }

    @JsonProperty("reassuranceIndicator")
    public String getReassuranceIndicator() {
        return reassuranceIndicator;
    }

    @JsonProperty("reassuranceIndicator")
    public void setReassuranceIndicator(String reassuranceIndicator) {
        this.reassuranceIndicator = reassuranceIndicator;
    }

    @JsonProperty("selectLineOfSubFile")
    public String getSelectLineOfSubFile() {
        return selectLineOfSubFile;
    }

    @JsonProperty("selectLineOfSubFile")
    public void setSelectLineOfSubFile(String selectLineOfSubFile) {
        this.selectLineOfSubFile = selectLineOfSubFile;
    }
}
