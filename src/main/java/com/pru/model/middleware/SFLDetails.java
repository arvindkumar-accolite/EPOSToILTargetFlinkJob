
package com.pru.model.middleware;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entity",
    "amountInOriginalCurrency",
    "subAccountCode",
    "subAccountType"
})
public class SFLDetails {

    @JsonProperty("entity")
    private String entity;
    @JsonProperty("amountInOriginalCurrency")
    private BigDecimal amountInOriginalCurrency;
    @JsonProperty("subAccountCode")
    private String subAccountCode;
    @JsonProperty("subAccountType")
    private String subAccountType;
    
    @JsonProperty("entity")
    public String getEntity() {
        return entity;
    }

    @JsonProperty("entity")
    public void setEntity(String entity) {
        this.entity = entity;
    }

    @JsonProperty("amountInOriginalCurrency")
    public BigDecimal getAmountInOriginalCurrency() {
        return amountInOriginalCurrency;
    }

    @JsonProperty("amountInOriginalCurrency")
    public void setAmountInOriginalCurrency(BigDecimal amountInOriginalCurrency) {
        this.amountInOriginalCurrency = amountInOriginalCurrency;
    }

    @JsonProperty("subAccountCode")
    public String getSubAccountCode() {
        return subAccountCode;
    }

    @JsonProperty("subAccountCode")
    public void setSubAccountCode(String subAccountCode) {
        this.subAccountCode = subAccountCode;
    }

    @JsonProperty("subAccountType")
    public String getSubAccountType() {
        return subAccountType;
    }

    @JsonProperty("subAccountType")
    public void setSubAccountType(String subAccountType) {
        this.subAccountType = subAccountType;
    }
}
