
package com.pru.model.middleware;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "assigneeParty",
    "commissionFromDate",
    "commissionToDate",
    "reasonCode"
})
public class AssigneeDetails {

    @JsonProperty("assigneeParty")
    private String assigneeParty;
    @JsonProperty("commissionFromDate")
    private String commissionFromDate;
    @JsonProperty("commissionToDate")
    private String commissionToDate;
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
    public String getCommissionFromDate() {
        return commissionFromDate;
    }

    @JsonProperty("commissionFromDate")
    public void setCommissionFromDate(String commissionFromDate) {
        this.commissionFromDate = commissionFromDate;
    }

    @JsonProperty("commissionToDate")
    public String getCommissionToDate() {
        return commissionToDate;
    }

    @JsonProperty("commissionToDate")
    public void setCommissionToDate(String commissionToDate) {
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
