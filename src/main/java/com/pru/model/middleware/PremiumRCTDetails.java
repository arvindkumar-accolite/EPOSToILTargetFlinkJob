
package com.pru.model.middleware;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "premiumRCTId", "bankedFlag", "bankCode", "bankDesc01", "bankDesc02", "bankDesc03", "bankKey",
		"cheqNumber", "documentAmount", "originalCurrency", "paymentType", "recievedFromCode", "recievedFromNumber",
		"currencyRate", "tranDate", "protectIndicator", "dissectionNumber", "sfldetails" })
public class PremiumRCTDetails {

	@JsonProperty("premiumRCTId")
	private String premiumRCTId;
	@JsonProperty("bankedFlag")
	private String bankedFlag;
	@JsonProperty("bankCode")
	private String bankCode;
	@JsonProperty("bankDesc01")
	private String bankDesc01;
	@JsonProperty("bankDesc02")
	private String bankDesc02;
	@JsonProperty("bankDesc03")
	private String bankDesc03;
	@JsonProperty("bankKey")
	private String bankKey;
	@JsonProperty("cheqNumber")
	private String cheqNumber;
	@JsonProperty("documentAmount")
	private BigDecimal documentAmount;
	@JsonProperty("originalCurrency")
	private String originalCurrency;
	@JsonProperty("paymentType")
	private String paymentType;
	@JsonProperty("recievedFromCode")
	private String recievedFromCode;
	@JsonProperty("recievedFromNumber")
	private String recievedFromNumber;
	@JsonProperty("currencyRate")
	private BigDecimal currencyRate;
	@JsonProperty("tranDate")
	private String tranDate;
	@JsonProperty("protectIndicator")
	private String protectIndicator;
	@JsonProperty("dissectionNumber")
	private BigInteger dissectionNumber;
	@JsonProperty("sfldetails")
	private List<SFLDetails> sfldetails = null;

	@JsonProperty("premiumRCTId")
	public String getPremiumRCTId() {
		return premiumRCTId;
	}

	@JsonProperty("premiumRCTId")
	public void setPremiumRCTId(String premiumRCTId) {
		this.premiumRCTId = premiumRCTId;
	}

	@JsonProperty("bankedFlag")
	public String getBankedFlag() {
		return bankedFlag;
	}

	@JsonProperty("bankedFlag")
	public void setBankedFlag(String bankedFlag) {
		this.bankedFlag = bankedFlag;
	}

	@JsonProperty("bankCode")
	public String getBankCode() {
		return bankCode;
	}

	@JsonProperty("bankCode")
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	@JsonProperty("bankDesc01")
	public String getBankDesc01() {
		return bankDesc01;
	}

	@JsonProperty("bankDesc01")
	public void setBankDesc01(String bankDesc01) {
		this.bankDesc01 = bankDesc01;
	}

	@JsonProperty("bankDesc02")
	public String getBankDesc02() {
		return bankDesc02;
	}

	@JsonProperty("bankDesc02")
	public void setBankDesc02(String bankDesc02) {
		this.bankDesc02 = bankDesc02;
	}

	@JsonProperty("bankDesc03")
	public String getBankDesc03() {
		return bankDesc03;
	}

	@JsonProperty("bankDesc03")
	public void setBankDesc03(String bankDesc03) {
		this.bankDesc03 = bankDesc03;
	}

	@JsonProperty("bankKey")
	public String getBankKey() {
		return bankKey;
	}

	@JsonProperty("bankKey")
	public void setBankKey(String bankKey) {
		this.bankKey = bankKey;
	}

	@JsonProperty("cheqNumber")
	public String getCheqNumber() {
		return cheqNumber;
	}

	@JsonProperty("cheqNumber")
	public void setCheqNumber(String cheqNumber) {
		this.cheqNumber = cheqNumber;
	}

	@JsonProperty("documentAmount")
	public BigDecimal getDocumentAmount() {
		return documentAmount;
	}

	@JsonProperty("documentAmount")
	public void setDocumentAmount(BigDecimal documentAmount) {
		this.documentAmount = documentAmount;
	}

	@JsonProperty("originalCurrency")
	public String getOriginalCurrency() {
		return originalCurrency;
	}

	@JsonProperty("originalCurrency")
	public void setOriginalCurrency(String originalCurrency) {
		this.originalCurrency = originalCurrency;
	}

	@JsonProperty("paymentType")
	public String getPaymentType() {
		return paymentType;
	}

	@JsonProperty("paymentType")
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@JsonProperty("recievedFromCode")
	public String getRecievedFromCode() {
		return recievedFromCode;
	}

	@JsonProperty("recievedFromCode")
	public void setRecievedFromCode(String recievedFromCode) {
		this.recievedFromCode = recievedFromCode;
	}

	@JsonProperty("recievedFromNumber")
	public String getRecievedFromNumber() {
		return recievedFromNumber;
	}

	@JsonProperty("recievedFromNumber")
	public void setRecievedFromNumber(String recievedFromNumber) {
		this.recievedFromNumber = recievedFromNumber;
	}

	@JsonProperty("currencyRate")
	public BigDecimal getCurrencyRate() {
		return currencyRate;
	}

	@JsonProperty("currencyRate")
	public void setCurrencyRate(BigDecimal currencyRate) {
		this.currencyRate = currencyRate;
	}

	@JsonProperty("tranDate")
	public String getTranDate() {
		return tranDate;
	}

	@JsonProperty("tranDate")
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	@JsonProperty("protectIndicator")
	public String getProtectIndicator() {
		return protectIndicator;
	}

	@JsonProperty("protectIndicator")
	public void setProtectIndicator(String protectIndicator) {
		this.protectIndicator = protectIndicator;
	}

	@JsonProperty("dissectionNumber")
	public BigInteger getDissectionNumber() {
		return dissectionNumber;
	}

	@JsonProperty("dissectionNumber")
	public void setDissectionNumber(BigInteger dissectionNumber) {
		this.dissectionNumber = dissectionNumber;
	}

	@JsonProperty("sfldetails")
	public List<SFLDetails> getSfldetails() {
		if (null == sfldetails) {
			sfldetails = new ArrayList<>();
		}
		return sfldetails;
	}

	@JsonProperty("sfldetails")
	public void setSfldetails(List<SFLDetails> sfldetails) {
		this.sfldetails = sfldetails;
	}

}
