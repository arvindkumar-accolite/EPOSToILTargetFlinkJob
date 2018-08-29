package com.prud.model.middleware;

import java.util.ArrayList;
import java.util.List;

public class Assignees {
	private String assigneeId;
	private List<AssigneeDetails> assigneeDetails;

	public String getAssigneeId() {
		return assigneeId;
	}

	public void setAssigneeId(String assigneeId) {
		this.assigneeId = assigneeId;
	}

	/**
	 * @return the assigneeDetails
	 */
	public List<AssigneeDetails> getAssigneeDetails() {
		if (assigneeDetails == null) {
			assigneeDetails = new ArrayList<AssigneeDetails>();
		}
		return this.assigneeDetails;
	}

	/**
	 * @param assigneedetails the assigneedetails to set
	 */
	public void setAssigneeDetails(List<AssigneeDetails> assigneedetails) {
		this.assigneeDetails = assigneedetails;
	}

}
