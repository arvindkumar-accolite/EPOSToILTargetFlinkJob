package com.prud.model.middleware;

import java.util.ArrayList;
import java.util.List;

public class Assignees {
	private String assigneeId;
	private List<AssigneeDetails> nbscrtiassigneedetails;

	public String getAssigneeId() {
		return assigneeId;
	}

	public void setAssigneeId(String assigneeId) {
		this.assigneeId = assigneeId;
	}

	public List<AssigneeDetails> getNbscrtiassigneedetails() {
		if (nbscrtiassigneedetails == null) {
			nbscrtiassigneedetails = new ArrayList<AssigneeDetails>();
		}
		return nbscrtiassigneedetails;
	}

	public void setNbscrtiassigneedetails(List<AssigneeDetails> nbscrtiassigneedetails) {
		this.nbscrtiassigneedetails = nbscrtiassigneedetails;
	}

}
