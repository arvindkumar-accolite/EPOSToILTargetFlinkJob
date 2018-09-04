
package com.pru.model.middleware;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bankAccountId",
    "clientSelectionWithBankDetails",
    "bankAccountDesc",
    "bankAccountKey",
    "bankKey",
    "currencyCode",
    "datefrom",
    "factoringHouse"
})
public class BankDetails {

    @JsonProperty("bankAccountId")
    private String bankAccountId;
    @JsonProperty("clientSelectionWithBankDetails")
    private String clientSelectionWithBankDetails;
    @JsonProperty("bankAccountDesc")
    private String bankAccountDesc;
    @JsonProperty("bankAccountKey")
    private String bankAccountKey;
    @JsonProperty("bankKey")
    private String bankKey;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("datefrom")
    private String datefrom;
    @JsonProperty("factoringHouse")
    private String factoringHouse;
   
    @JsonProperty("bankAccountId")
    public String getBankAccountId() {
        return bankAccountId;
    }

    @JsonProperty("bankAccountId")
    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    @JsonProperty("clientSelectionWithBankDetails")
    public String getClientSelectionWithBankDetails() {
        return clientSelectionWithBankDetails;
    }

    @JsonProperty("clientSelectionWithBankDetails")
    public void setClientSelectionWithBankDetails(String clientSelectionWithBankDetails) {
        this.clientSelectionWithBankDetails = clientSelectionWithBankDetails;
    }

    @JsonProperty("bankAccountDesc")
    public String getBankAccountDesc() {
        return bankAccountDesc;
    }

    @JsonProperty("bankAccountDesc")
    public void setBankAccountDesc(String bankAccountDesc) {
        this.bankAccountDesc = bankAccountDesc;
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

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("datefrom")
    public String getDatefrom() {
        return datefrom;
    }

    @JsonProperty("datefrom")
    public void setDatefrom(String datefrom) {
        this.datefrom = datefrom;
    }

    @JsonProperty("factoringHouse")
    public String getFactoringHouse() {
        return factoringHouse;
    }

    @JsonProperty("factoringHouse")
    public void setFactoringHouse(String factoringHouse) {
        this.factoringHouse = factoringHouse;
    }

}
