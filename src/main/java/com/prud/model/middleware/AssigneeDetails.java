package com.prud.model.middleware;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "assigneeParty", "commissionFromDate", "commissionToDate", "reasonCode" })
public class AssigneeDetails {

	@JsonProperty("assigneeParty")
	private String assigneeParty;
	@JsonProperty("commissionFromDate")
	private BigInteger commissionFromDate;
	@JsonProperty("commissionToDate")
	private BigInteger commissionToDate;
	@JsonProperty("reasonCode")
	private String reasonCode;

	@JsonProperty("assigneeParty")
	public String getAssigneeParty() {
		return assigneeParty;
	}

	@JsonProperty("assigneeParty")
	public void setAssigneeParty(String assigneeParty) {
		this.assigneeParty = assigneeParty;
	}

	@JsonProperty("commissionFromDate")
	public BigInteger getCommissionFromDate() {
		return commissionFromDate;
	}

	@JsonProperty("commissionFromDate")
	public void setCommissionFromDate(BigInteger commissionFromDate) {
		this.commissionFromDate = commissionFromDate;
	}

	@JsonProperty("commissionToDate")
	public BigInteger getCommissionToDate() {
		return commissionToDate;
	}

	@JsonProperty("commissionToDate")
	public void setCommissionToDate(BigInteger commissionToDate) {
		this.commissionToDate = commissionToDate;
	}

	@JsonProperty("reasonCode")
	public String getReasonCode() {
		return reasonCode;
	}

	@JsonProperty("reasonCode")
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

}
