
package com.pru.model.middleware;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contractHDREntId",
    "contractNumber",
    "contractType",
    "agentNumber",
    "billingRenewalDate",
    "billingCurrency",
    "billingfrequency",
    "billingRenewalIndicator",
    "contractCurrency",
    "methodOfPayment",
    "proposalDate",
    "planSuffix",
    "register",
    "accountType",
    "originalCommencementDate"
})
public class ContractDetails {

    @JsonProperty("contractHDREntId")
    private String contractHDREntId;
    @JsonProperty("contractNumber")
    private String contractNumber;
    @JsonProperty("contractType")
    private String contractType;
    @JsonProperty("agentNumber")
    private String agentNumber;
    @JsonProperty("billingRenewalDate")
    private String billingRenewalDate;
    @JsonProperty("billingCurrency")
    private String billingCurrency;
    @JsonProperty("billingfrequency")
    private String billingfrequency;
    @JsonProperty("billingRenewalIndicator")
    private BigInteger billingRenewalIndicator;
    @JsonProperty("contractCurrency")
    private String contractCurrency;
    @JsonProperty("methodOfPayment")
    private String methodOfPayment;
    @JsonProperty("proposalDate")
    private String proposalDate;
    @JsonProperty("planSuffix")
    private BigInteger planSuffix;
    @JsonProperty("register")
    private String register;
    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("originalCommencementDate")
    private String originalCommencementDate;
    
    @JsonProperty("contractHDREntId")
    public String getContractHDREntId() {
        return contractHDREntId;
    }

    @JsonProperty("contractHDREntId")
    public void setContractHDREntId(String contractHDREntId) {
        this.contractHDREntId = contractHDREntId;
    }

    @JsonProperty("contractNumber")
    public String getContractNumber() {
        return contractNumber;
    }

    @JsonProperty("contractNumber")
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    @JsonProperty("contractType")
    public String getContractType() {
        return contractType;
    }

    @JsonProperty("contractType")
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    @JsonProperty("agentNumber")
    public String getAgentNumber() {
        return agentNumber;
    }

    @JsonProperty("agentNumber")
    public void setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber;
    }

    @JsonProperty("billingRenewalDate")
    public String getBillingRenewalDate() {
        return billingRenewalDate;
    }

    @JsonProperty("billingRenewalDate")
    public void setBillingRenewalDate(String billingRenewalDate) {
        this.billingRenewalDate = billingRenewalDate;
    }

    @JsonProperty("billingCurrency")
    public String getBillingCurrency() {
        return billingCurrency;
    }

    @JsonProperty("billingCurrency")
    public void setBillingCurrency(String billingCurrency) {
        this.billingCurrency = billingCurrency;
    }

    @JsonProperty("billingfrequency")
    public String getBillingfrequency() {
        return billingfrequency;
    }

    @JsonProperty("billingfrequency")
    public void setBillingfrequency(String billingfrequency) {
        this.billingfrequency = billingfrequency;
    }

    @JsonProperty("billingRenewalIndicator")
    public BigInteger getBillingRenewalIndicator() {
        return billingRenewalIndicator;
    }

    @JsonProperty("billingRenewalIndicator")
    public void setBillingRenewalIndicator(BigInteger billingRenewalIndicator) {
        this.billingRenewalIndicator = billingRenewalIndicator;
    }

    @JsonProperty("contractCurrency")
    public String getContractCurrency() {
        return contractCurrency;
    }

    @JsonProperty("contractCurrency")
    public void setContractCurrency(String contractCurrency) {
        this.contractCurrency = contractCurrency;
    }

    @JsonProperty("methodOfPayment")
    public String getMethodOfPayment() {
        return methodOfPayment;
    }

    @JsonProperty("methodOfPayment")
    public void setMethodOfPayment(String methodOfPayment) {
        this.methodOfPayment = methodOfPayment;
    }

    @JsonProperty("proposalDate")
    public String getProposalDate() {
        return proposalDate;
    }

    @JsonProperty("proposalDate")
    public void setProposalDate(String proposalDate) {
        this.proposalDate = proposalDate;
    }

    @JsonProperty("planSuffix")
    public BigInteger getPlanSuffix() {
        return planSuffix;
    }

    @JsonProperty("planSuffix")
    public void setPlanSuffix(BigInteger planSuffix) {
        this.planSuffix = planSuffix;
    }

    @JsonProperty("register")
    public String getRegister() {
        return register;
    }

    @JsonProperty("register")
    public void setRegister(String register) {
        this.register = register;
    }

    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("accountType")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("originalCommencementDate")
    public String getOriginalCommencementDate() {
        return originalCommencementDate;
    }

    @JsonProperty("originalCommencementDate")
    public void setOriginalCommencementDate(String originalCommencementDate) {
        this.originalCommencementDate = originalCommencementDate;
    }
}
