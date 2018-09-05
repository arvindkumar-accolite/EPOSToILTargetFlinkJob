package com.pru.mapper.customconverter;

import java.util.ArrayList;
import java.util.List;

import com.pru.model.il.NBSCRTIREC.NBSCRTIQUESTION;
import com.pru.model.middleware.QuestionDetails;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class QuestionDetailsCustomConverter extends CustomConverter<List<QuestionDetails>, List<NBSCRTIQUESTION>> {

	public List<NBSCRTIQUESTION> convert(List<QuestionDetails> source,
			Type<? extends List<NBSCRTIQUESTION>> destinationType) {
		if (null == source) {
			return null;
		}
		List<NBSCRTIQUESTION> targetQuestione = new ArrayList<>();
		for (QuestionDetails questionDetails : source) {
			NBSCRTIQUESTION targetQuestioneDetails = new NBSCRTIQUESTION();
			targetQuestioneDetails.setANSWER(questionDetails.getAnswer());
			targetQuestioneDetails.setQUESTIONENTID(questionDetails.getQuestionId());
			targetQuestioneDetails.setQUESTIONPARENT(questionDetails.getQuestionParent());
			targetQuestione.add(targetQuestioneDetails);
		}
		return targetQuestione;
	}

}
