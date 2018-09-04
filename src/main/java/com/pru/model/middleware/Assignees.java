
package com.pru.model.middleware;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "assigneeId", "assigneeDetails" })
public class Assignees {

	@JsonProperty("assigneeId")
	private String assigneeId;
	@JsonProperty("assigneeDetails")
	private List<AssigneeDetails> assigneeDetails = null;

	@JsonProperty("assigneeDetails")
	public List<AssigneeDetails> getAssigneeDetails() {
		if (null == assigneeDetails) {
			assigneeDetails = new ArrayList<AssigneeDetails>();
		}
		return assigneeDetails;
	}

	@JsonProperty("assigneeDetails")
	public void setAssigneeDetails(List<AssigneeDetails> assigneeDetails) {
		this.assigneeDetails = assigneeDetails;
	}

	@JsonProperty("assigneeId")
	public String getAssigneeId() {
		return assigneeId;
	}

	@JsonProperty("assigneeId")
	public void setAssigneeId(String assigneeId) {
		this.assigneeId = assigneeId;
	}
}
