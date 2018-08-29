package com.prud.model.middleware;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PremiumRCTDetails {
	private String premiumRCTId;
	private String bankedFlag;
	private String bankCode;
	private String bankDesc01;
	private String bankDesc02;
	private String bankDesc03;
	private String bankKey;
	private String cheqNumber;
	private BigDecimal documentAmount;
	private String originalCurrency;
	private String paymentType;
	private String recievedFromCode;
	private String recievedFromNumber;
	private BigDecimal currencyRate;
	private BigInteger tranDate;
	private List<SFLDetails> sflDetails;
	private String protectIndicator;
	private BigInteger dissectionNumber;

	public String getPremiumRCTId() {
		return premiumRCTId;
	}

	public void setPremiumRCTId(String premiumRCTId) {
		this.premiumRCTId = premiumRCTId;
	}

	public String getBankedFlag() {
		return bankedFlag;
	}

	public void setBankedFlag(String bankedFlag) {
		this.bankedFlag = bankedFlag;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankDesc01() {
		return bankDesc01;
	}

	public void setBankDesc01(String bankDesc01) {
		this.bankDesc01 = bankDesc01;
	}

	public String getBankDesc02() {
		return bankDesc02;
	}

	public void setBankDesc02(String bankDesc02) {
		this.bankDesc02 = bankDesc02;
	}

	public String getBankDesc03() {
		return bankDesc03;
	}

	public void setBankDesc03(String bankDesc03) {
		this.bankDesc03 = bankDesc03;
	}

	public String getBankKey() {
		return bankKey;
	}

	public void setBankKey(String bankKey) {
		this.bankKey = bankKey;
	}

	public String getCheqNumber() {
		return cheqNumber;
	}

	public void setCheqNumber(String cheqNumber) {
		this.cheqNumber = cheqNumber;
	}

	public BigDecimal getDocumentAmount() {
		return documentAmount;
	}

	public void setDocumentAmount(BigDecimal documentAmount) {
		this.documentAmount = documentAmount;
	}

	public String getOriginalCurrency() {
		return originalCurrency;
	}

	public void setOriginalCurrency(String originalCurrency) {
		this.originalCurrency = originalCurrency;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getRecievedFromCode() {
		return recievedFromCode;
	}

	public void setRecievedFromCode(String recievedFromCode) {
		this.recievedFromCode = recievedFromCode;
	}

	public String getRecievedFromNumber() {
		return recievedFromNumber;
	}

	public void setRecievedFromNumber(String recievedFromNumber) {
		this.recievedFromNumber = recievedFromNumber;
	}

	public BigDecimal getCurrencyRate() {
		return currencyRate;
	}

	public void setCurrencyRate(BigDecimal currencyRate) {
		this.currencyRate = currencyRate;
	}

	public BigInteger getTranDate() {
		return tranDate;
	}

	public void setTranDate(BigInteger tranDate) {
		this.tranDate = tranDate;
	}

	public List<SFLDetails> getSflDetails() {
		if(sflDetails==null) {
			sflDetails = new ArrayList<>();
		}
		return sflDetails;
	}

	public void setSflDetails(List<SFLDetails> sflDetails) {
		this.sflDetails = sflDetails;
	}

	public String getProtectIndicator() {
		return protectIndicator;
	}

	public void setProtectIndicator(String protectIndicator) {
		this.protectIndicator = protectIndicator;
	}

	public BigInteger getDissectionNumber() {
		return dissectionNumber;
	}

	public void setDissectionNumber(BigInteger dissectionNumber) {
		this.dissectionNumber = dissectionNumber;
	}

}
