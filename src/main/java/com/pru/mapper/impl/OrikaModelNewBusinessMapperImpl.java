package com.pru.mapper.impl;

import java.util.Map;

import org.apache.flink.api.java.utils.ParameterTool;

import com.pru.config.PropertyLoader;
import com.pru.constant.NewBusinessMapperConstants;
import com.pru.mapper.ModelMapper;
import com.pru.mapper.customconverter.AssigneeDetailsCustomConverter;
import com.pru.mapper.customconverter.BankDetailsDateFromCustomConverter;
import com.pru.mapper.customconverter.BeneficiaryDetailsCustomConverter;
import com.pru.mapper.customconverter.BillingRenewalDateCustomConverter;
import com.pru.mapper.customconverter.ClientDetailsCustomConvertor;
import com.pru.mapper.customconverter.CoverageDetailsCustomConverter;
import com.pru.mapper.customconverter.LifeDetailsCustomConverter;
import com.pru.mapper.customconverter.MandatoryEffectiveDateCustomConvertor;
import com.pru.mapper.customconverter.OriginalCommencementDateCustomConvertor;
import com.pru.mapper.customconverter.PreminumTransactionDateCustomConvertor;
import com.pru.mapper.customconverter.ProposalDateCustomConvertor;
import com.pru.mapper.customconverter.QuestionDetailsCustomConverter;
import com.pru.mapper.customconverter.RiderDetailsCustomConverter;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;

/**
 * @param <S>
 *            // * //
 */
public class OrikaModelNewBusinessMapperImpl implements ModelMapper {

	private ParameterTool newBizParameters;
	private MapperFacade mapper;
	MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
	ConverterFactory converterFactory = mapperFactory.getConverterFactory();

	public OrikaModelNewBusinessMapperImpl() {
		newBizParameters=PropertyLoader.getNewBizProposalCustomPropConfig();
		converterFactory.registerConverter(NewBusinessMapperConstants.ASSIGNEE_KEY, new AssigneeDetailsCustomConverter());
		converterFactory.registerConverter(NewBusinessMapperConstants.BENEFICIARY_KEY, new BeneficiaryDetailsCustomConverter());
		converterFactory.registerConverter(NewBusinessMapperConstants.CLIENT_DETAILS_KEY, new ClientDetailsCustomConvertor());
		converterFactory.registerConverter(NewBusinessMapperConstants.COVERAGE_DETAILS_KEY, new CoverageDetailsCustomConverter());
		converterFactory.registerConverter(NewBusinessMapperConstants.LIFE_DETAILS_KEY, new LifeDetailsCustomConverter());
		converterFactory.registerConverter(NewBusinessMapperConstants.RIDER_DETAILS_KEY, new RiderDetailsCustomConverter());
		converterFactory.registerConverter(NewBusinessMapperConstants.QUESTION_DETAILS_KEY, new QuestionDetailsCustomConverter());

		converterFactory.registerConverter(NewBusinessMapperConstants.BANK_DETAILS_DATE_FROM_KEY, new BankDetailsDateFromCustomConverter());
		converterFactory.registerConverter(NewBusinessMapperConstants.BILLING_RENEWAL_DATE_KEY, new BillingRenewalDateCustomConverter());
		converterFactory.registerConverter(NewBusinessMapperConstants.MANDATORY_EFFECTIVE_DATE_KEY, new MandatoryEffectiveDateCustomConvertor());
		converterFactory.registerConverter(NewBusinessMapperConstants.PREMINUM_TRANSACTION_DATE_KEY, new PreminumTransactionDateCustomConvertor());
		converterFactory.registerConverter(NewBusinessMapperConstants.PROPOSAL_DATE_KEY, new ProposalDateCustomConvertor());
		converterFactory.registerConverter(NewBusinessMapperConstants.ORIGINAL_COMMENCEMENT_DATE_KEY, new OriginalCommencementDateCustomConvertor());
	}

	@SuppressWarnings("unchecked")

	public Object map(Object source, Class sourceClass, Class targetClass, Map<String, String> map) {
		ClassMapBuilder<Object, Object> classMapBilder = mapperFactory.classMap(sourceClass, targetClass);
		if (!map.isEmpty()) {
			for (Map.Entry<String, String> enrty : map.entrySet()) {
				classMapBilder.field(enrty.getKey(), enrty.getValue());
			}
		}
	    classMapBilder.fieldMap(newBizParameters.get(NewBusinessMapperConstants.ASSIGNEE_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.ASSIGNEE_TRG_PATH)).converter(NewBusinessMapperConstants.ASSIGNEE_KEY).add()
			.fieldMap(newBizParameters.get(NewBusinessMapperConstants.BENEFICIARY_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.BENEFICIARY_TRG_PATH)).converter(NewBusinessMapperConstants.BENEFICIARY_KEY).add()
			.fieldMap(newBizParameters.get(NewBusinessMapperConstants.CLIENT_DETAILS_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.CLIENT_DETAILS_TRG_PATH)).converter(NewBusinessMapperConstants.CLIENT_DETAILS_KEY).add()
			.fieldMap(newBizParameters.get(NewBusinessMapperConstants.COVERAGE_DETAILS_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.COVERAGE_DETAILS_TRG_PATH)).converter(NewBusinessMapperConstants.COVERAGE_DETAILS_KEY).add()
			.fieldMap(newBizParameters.get(NewBusinessMapperConstants.LIFE_DETAILS_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.LIFE_DETAILS_TRG_PATH)).converter(NewBusinessMapperConstants.LIFE_DETAILS_KEY).add()
			.fieldMap(newBizParameters.get(NewBusinessMapperConstants.RIDER_DETAILS_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.RIDER_DETAILS_TRG_PATH)).converter(NewBusinessMapperConstants.RIDER_DETAILS_KEY).add()
			.fieldMap(newBizParameters.get(NewBusinessMapperConstants.QUESTION_DETAILS_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.QUESTION_DETAILS_TRG_PATH)).converter(NewBusinessMapperConstants.QUESTION_DETAILS_KEY).add()
			.fieldMap(newBizParameters.get(NewBusinessMapperConstants.BANK_DETAILS_DATE_FROM_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.BANK_DETAILS_DATE_FROM_TRG_PATH)).converter(NewBusinessMapperConstants.BANK_DETAILS_DATE_FROM_KEY).add()
			.fieldMap(newBizParameters.get(NewBusinessMapperConstants.BILLING_RENEWAL_DATE_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.BILLING_RENEWAL_DATE_TRG_PATH)).converter(NewBusinessMapperConstants.BILLING_RENEWAL_DATE_KEY).add()
			.fieldMap(newBizParameters.get(NewBusinessMapperConstants.MANDATORY_EFFECTIVE_DATE_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.MANDATORY_EFFECTIVE_DATE_TRG_PATH)).converter(NewBusinessMapperConstants.MANDATORY_EFFECTIVE_DATE_KEY).add()
			.fieldMap(newBizParameters.get(NewBusinessMapperConstants.PREMINUM_TRANSACTION_DATE_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.PREMINUM_TRANSACTION_DATE_TRG_PATH)).converter(NewBusinessMapperConstants.PREMINUM_TRANSACTION_DATE_KEY).add()
			.fieldMap(newBizParameters.get(NewBusinessMapperConstants.PROPOSAL_DATE_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.PROPOSAL_DATE_TRG_PATH)).converter(NewBusinessMapperConstants.PROPOSAL_DATE_KEY).add()
			.fieldMap(newBizParameters.get(NewBusinessMapperConstants.ORIGINAL_COMMENCEMENT_DATE_SRC_PATH), newBizParameters.get(NewBusinessMapperConstants.ORIGINAL_COMMENCEMENT_DATE_TRG_PATH)).converter(NewBusinessMapperConstants.ORIGINAL_COMMENCEMENT_DATE_KEY).add()
			.byDefault().register();
		mapper = mapperFactory.getMapperFacade();
		return mapper.map(source, targetClass);
	}
}
