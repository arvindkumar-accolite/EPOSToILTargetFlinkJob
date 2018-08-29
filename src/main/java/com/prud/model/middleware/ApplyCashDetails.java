package com.prud.model.middleware;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"applyCashId",
"receiptNo"
})
public class ApplyCashDetails {
	@JsonProperty("applyCashId")
	private String applyCashId;
	@JsonProperty("receiptNo")
	private String receiptNo;
	public String getApplyCashId() {
		return applyCashId;
	}
	public void setApplyCashId(String applyCashId) {
		this.applyCashId = applyCashId;
	}
	public String getReceiptNo() {
		return receiptNo;
	}
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

}
