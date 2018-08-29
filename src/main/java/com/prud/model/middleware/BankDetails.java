package com.prud.model.middleware;

import java.math.BigInteger;

public class BankDetails {
	private String bankAccountId;
	private String clientSelectionWithBankDetails;
	private String bankAccountDesc;
	private String bankAccountKey;
	private String bankKey;
	private String currencyCode;
	private BigInteger datefrom;
	private String factoringHouse;

	public String getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(String bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public String getClientSelectionWithBankDetails() {
		return clientSelectionWithBankDetails;
	}

	public void setClientSelectionWithBankDetails(String clientSelectionWithBankDetails) {
		this.clientSelectionWithBankDetails = clientSelectionWithBankDetails;
	}

	public String getBankAccountDesc() {
		return bankAccountDesc;
	}

	public void setBankAccountDesc(String bankAccountDesc) {
		this.bankAccountDesc = bankAccountDesc;
	}

	public String getBankAccountKey() {
		return bankAccountKey;
	}

	public void setBankAccountKey(String bankAccountKey) {
		this.bankAccountKey = bankAccountKey;
	}

	public String getBankKey() {
		return bankKey;
	}

	public void setBankKey(String bankKey) {
		this.bankKey = bankKey;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BigInteger getDatefrom() {
		return datefrom;
	}

	public void setDatefrom(BigInteger datefrom) {
		this.datefrom = datefrom;
	}

	public String getFactoringHouse() {
		return factoringHouse;
	}

	public void setFactoringHouse(String factoringHouse) {
		this.factoringHouse = factoringHouse;
	}
}
