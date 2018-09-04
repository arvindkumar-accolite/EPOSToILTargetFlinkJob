
package com.pru.model.middleware;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "questionId", "questionParent", "answer" })
public class QuestionDetails {

	@JsonProperty("questionId")
	private String questionId;
	@JsonProperty("questionParent")
	private String questionParent;
	@JsonProperty("answer")
	private String answer;

	@JsonProperty("questionId")
	public String getQuestionId() {
		return questionId;
	}

	@JsonProperty("questionId")
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	@JsonProperty("questionParent")
	public String getQuestionParent() {
		return questionParent;
	}

	@JsonProperty("questionParent")
	public void setQuestionParent(String questionParent) {
		this.questionParent = questionParent;
	}

	@JsonProperty("answer")
	public String getAnswer() {
		return answer;
	}

	@JsonProperty("answer")
	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
