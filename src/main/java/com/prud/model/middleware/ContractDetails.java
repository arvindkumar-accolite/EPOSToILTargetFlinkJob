package com.prud.model.middleware;

import java.math.BigInteger;

public class ContractDetails {
	private String contractHDREntId;
	private String contractNumber;
	private String contractType;
	private String agentNumber;
	private BigInteger billingRenewalDate;
	private String billingCurrency;
	private String billingfrequency;
	private BigInteger billingRenewalIndicator;
	private String contractCurrency;
	private String methodOfPayment;
	private BigInteger proposalDate;
	private BigInteger OriginalCommencementDate;
	private BigInteger planSuffix;
	private String register;
	private String accountType;

	public String getContractHDREntId() {
		return contractHDREntId;
	}

	public void setContractHDREntId(String contractHDREntId) {
		this.contractHDREntId = contractHDREntId;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getAgentNumber() {
		return agentNumber;
	}

	public void setAgentNumber(String agentNumber) {
		this.agentNumber = agentNumber;
	}

	public BigInteger getBillingRenewalDate() {
		return billingRenewalDate;
	}

	public void setBillingRenewalDate(BigInteger billingRenewalDate) {
		this.billingRenewalDate = billingRenewalDate;
	}

	public String getBillingCurrency() {
		return billingCurrency;
	}

	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	public String getBillingfrequency() {
		return billingfrequency;
	}

	public void setBillingfrequency(String billingfrequency) {
		this.billingfrequency = billingfrequency;
	}

	public BigInteger getBillingRenewalIndicator() {
		return billingRenewalIndicator;
	}

	public void setBillingRenewalIndicator(BigInteger billingRenewalIndicator) {
		this.billingRenewalIndicator = billingRenewalIndicator;
	}

	public String getContractCurrency() {
		return contractCurrency;
	}

	public void setContractCurrency(String contractCurrency) {
		this.contractCurrency = contractCurrency;
	}

	public String getMethodOfPayment() {
		return methodOfPayment;
	}

	public void setMethodOfPayment(String methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}

	public BigInteger getProposalDate() {
		return proposalDate;
	}

	public void setProposalDate(BigInteger proposalDate) {
		this.proposalDate = proposalDate;
	}

	public BigInteger getOriginalCommencementDate() {
		return OriginalCommencementDate;
	}

	public void setOriginalCommencementDate(BigInteger originalCommencementDate) {
		OriginalCommencementDate = originalCommencementDate;
	}

	public BigInteger getPlanSuffix() {
		return planSuffix;
	}

	public void setPlanSuffix(BigInteger planSuffix) {
		this.planSuffix = planSuffix;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
