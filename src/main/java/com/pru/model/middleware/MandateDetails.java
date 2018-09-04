
package com.pru.model.middleware;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mandateId",
    "clientNumber",
    "mandateRefNumber",
    "bankAccountKey",
    "bankKey",
    "effectiveDate",
    "factoringHouse",
    "mandateStatus",
    "timesToUse"
})
public class MandateDetails {

    @JsonProperty("mandateId")
    private String mandateId;
    @JsonProperty("clientNumber")
    private String clientNumber;
    @JsonProperty("mandateRefNumber")
    private String mandateRefNumber;
    @JsonProperty("bankAccountKey")
    private String bankAccountKey;
    @JsonProperty("bankKey")
    private String bankKey;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("factoringHouse")
    private String factoringHouse;
    @JsonProperty("mandateStatus")
    private String mandateStatus;
    @JsonProperty("timesToUse")
    private BigInteger timesToUse;
   
    @JsonProperty("mandateId")
    public String getMandateId() {
        return mandateId;
    }

    @JsonProperty("mandateId")
    public void setMandateId(String mandateId) {
        this.mandateId = mandateId;
    }

    @JsonProperty("clientNumber")
    public String getClientNumber() {
        return clientNumber;
    }

    @JsonProperty("clientNumber")
    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    @JsonProperty("mandateRefNumber")
    public String getMandateRefNumber() {
        return mandateRefNumber;
    }

    @JsonProperty("mandateRefNumber")
    public void setMandateRefNumber(String mandateRefNumber) {
        this.mandateRefNumber = mandateRefNumber;
    }

    @JsonProperty("bankAccountKey")
    public String getBankAccountKey() {
        return bankAccountKey;
    }

    @JsonProperty("bankAccountKey")
    public void setBankAccountKey(String bankAccountKey) {
        this.bankAccountKey = bankAccountKey;
    }

    @JsonProperty("bankKey")
    public String getBankKey() {
        return bankKey;
    }

    @JsonProperty("bankKey")
    public void setBankKey(String bankKey) {
        this.bankKey = bankKey;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("factoringHouse")
    public String getFactoringHouse() {
        return factoringHouse;
    }

    @JsonProperty("factoringHouse")
    public void setFactoringHouse(String factoringHouse) {
        this.factoringHouse = factoringHouse;
    }

    @JsonProperty("mandateStatus")
    public String getMandateStatus() {
        return mandateStatus;
    }

    @JsonProperty("mandateStatus")
    public void setMandateStatus(String mandateStatus) {
        this.mandateStatus = mandateStatus;
    }

    @JsonProperty("timesToUse")
    public BigInteger getTimesToUse() {
        return timesToUse;
    }

    @JsonProperty("timesToUse")
    public void setTimesToUse(BigInteger timesToUse) {
        this.timesToUse = timesToUse;
    }
}
