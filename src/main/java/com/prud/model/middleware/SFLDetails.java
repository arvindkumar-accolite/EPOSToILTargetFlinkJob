package com.prud.model.middleware;

import java.math.BigDecimal;

public class SFLDetails {
	private String entity;
	private BigDecimal amountInOriginalCurrency;
	private String subAccountCode;
	private String subAccountType;

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public BigDecimal getAmountInOriginalCurrency() {
		return amountInOriginalCurrency;
	}

	public void setAmountInOriginalCurrency(BigDecimal amountInOriginalCurrency) {
		this.amountInOriginalCurrency = amountInOriginalCurrency;
	}

	public String getSubAccountCode() {
		return subAccountCode;
	}

	public void setSubAccountCode(String subAccountCode) {
		this.subAccountCode = subAccountCode;
	}

	public String getSubAccountType() {
		return subAccountType;
	}

	public void setSubAccountType(String subAccountType) {
		this.subAccountType = subAccountType;
	}

}
