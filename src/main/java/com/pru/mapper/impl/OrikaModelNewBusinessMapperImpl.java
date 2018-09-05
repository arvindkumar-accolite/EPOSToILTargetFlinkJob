package com.pru.mapper.impl;

import java.util.Map;

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

	private MapperFacade mapper;
	MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
	ConverterFactory converterFactory = mapperFactory.getConverterFactory();

	public OrikaModelNewBusinessMapperImpl() {
		converterFactory.registerConverter("assigneeCC", new AssigneeDetailsCustomConverter());
		converterFactory.registerConverter("beneficiaryCC", new BeneficiaryDetailsCustomConverter());
		converterFactory.registerConverter("clientDetailsCC", new ClientDetailsCustomConvertor());
		converterFactory.registerConverter("coverageDetailsCC", new CoverageDetailsCustomConverter());
		converterFactory.registerConverter("lifeDetailsCC", new LifeDetailsCustomConverter());
		converterFactory.registerConverter("riderDetailsCC", new RiderDetailsCustomConverter());
		converterFactory.registerConverter("questionDetailsCC", new QuestionDetailsCustomConverter());

		converterFactory.registerConverter("bankDetailsDateFromCC", new BankDetailsDateFromCustomConverter());
		converterFactory.registerConverter("billingRenewalDateCC", new BillingRenewalDateCustomConverter());
		converterFactory.registerConverter("mandatoryEffectiveDateCC", new MandatoryEffectiveDateCustomConvertor());
		converterFactory.registerConverter("preminumTransactionDateCC", new PreminumTransactionDateCustomConvertor());
		converterFactory.registerConverter("proposalDateCC", new ProposalDateCustomConvertor());
		converterFactory.registerConverter("originalCommencementDateCC", new OriginalCommencementDateCustomConvertor());
	}

	@SuppressWarnings("unchecked")

	public Object map(Object source, Class sourceClass, Class targetClass, Map<String, String> map) {
		ClassMapBuilder<Object, Object> classMapBilder = mapperFactory.classMap(sourceClass, targetClass);
		if (!map.isEmpty()) {
			for (Map.Entry<String, String> enrty : map.entrySet()) {
				classMapBilder.field(enrty.getKey(), enrty.getValue());
			}
		}
	    classMapBilder.fieldMap("assignees.assigneeDetails", "assignees.nbscrtiassigneedetails").converter("assigneeCC").add()
			.fieldMap("beneficiary.beneficiaryDetails", "beneficiary.nbscrtibendetails").converter("beneficiaryCC").add()
			.fieldMap("clientDetails", "nbscrticlient").converter("clientDetailsCC").add()
			.fieldMap("coverageDetails", "nbscrticoveragedetails").converter("coverageDetailsCC").add()
			.fieldMap("lifeDetails", "nbscrtilives").converter("lifeDetailsCC").add()
			.fieldMap("riderDetails", "nbscrtiriderdetails").converter("riderDetailsCC").add()
			.fieldMap("questionDetails", "nbscrtiquestion").converter("questionDetailsCC").add()
			.fieldMap("bankDetails.datefrom", "nbscrtibankdetails.datefrom").converter("bankDetailsDateFromCC").add()
			.fieldMap("contractDetails.billingRenewalDate", "nbscrticontracthdrdetails.billcd").converter("billingRenewalDateCC").add()
			.fieldMap("mandateDetails.effectiveDate", "nbscrtimandatedetails.effdate").converter("mandatoryEffectiveDateCC").add()
			.fieldMap("premiumRCTDetails.tranDate", "nbscrtipremiumrctdetails.trandatex").converter("preminumTransactionDateCC").add()
			.fieldMap("contractDetails.proposalDate", "nbscrticontracthdrdetails.hpropdte").converter("proposalDateCC").add()
			.fieldMap("contractDetails.originalCommencementDate", "nbscrticontracthdrdetails.occdate").converter("originalCommencementDateCC").add()
			.byDefault().register();
		mapper = mapperFactory.getMapperFacade();
		return mapper.map(source, targetClass);
	}
}
