
package com.pru.model.middleware;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "beneficiaryParty",
    "beneficiaryPercentage",
    "beneficiaryClientNumber",
    "beneficiaryType",
    "clientRelationship",
    "effectiveDate"
})
public class BeneficiaryDetails {

    @JsonProperty("beneficiaryParty")
    private String beneficiaryParty;
    @JsonProperty("beneficiaryPercentage")
    private BigDecimal beneficiaryPercentage;
    @JsonProperty("beneficiaryClientNumber")
    private String beneficiaryClientNumber;
    @JsonProperty("beneficiaryType")
    private String beneficiaryType;
    @JsonProperty("clientRelationship")
    private String clientRelationship;
    @JsonProperty("effectiveDate")
    private String effectiveDate;

    @JsonProperty("beneficiaryParty")
    public String getBeneficiaryParty() {
        return beneficiaryParty;
    }

    @JsonProperty("beneficiaryParty")
    public void setBeneficiaryParty(String beneficiaryParty) {
        this.beneficiaryParty = beneficiaryParty;
    }

    @JsonProperty("beneficiaryPercentage")
    public BigDecimal getBeneficiaryPercentage() {
        return beneficiaryPercentage;
    }

    @JsonProperty("beneficiaryPercentage")
    public void setBeneficiaryPercentage(BigDecimal beneficiaryPercentage) {
        this.beneficiaryPercentage = beneficiaryPercentage;
    }

    @JsonProperty("beneficiaryClientNumber")
    public String getBeneficiaryClientNumber() {
        return beneficiaryClientNumber;
    }

    @JsonProperty("beneficiaryClientNumber")
    public void setBeneficiaryClientNumber(String beneficiaryClientNumber) {
        this.beneficiaryClientNumber = beneficiaryClientNumber;
    }

    @JsonProperty("beneficiaryType")
    public String getBeneficiaryType() {
        return beneficiaryType;
    }

    @JsonProperty("beneficiaryType")
    public void setBeneficiaryType(String beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }

    @JsonProperty("clientRelationship")
    public String getClientRelationship() {
        return clientRelationship;
    }

    @JsonProperty("clientRelationship")
    public void setClientRelationship(String clientRelationship) {
        this.clientRelationship = clientRelationship;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
