package com.prud.mapper.impl;

import java.util.Map;

import com.prud.constant.IntegrationConstants;
import com.prud.mapper.ModelMapper;

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
		
		converterFactory.registerConverter("bankDetailsDateFromCC", new BankDetailsDateFromCustomConverter());
		converterFactory.registerConverter("billingRenewalDateCC", new BillingRenewalDateCustomConverter());
		converterFactory.registerConverter("mandatoryEffectiveCC", new MandatoryEffectiveDateCustomConvertor());
		converterFactory.registerConverter("preminumTransactionCC", new PreminumTransactionDateCustomConvertor());
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
		.fieldMap("bankDetails.datefrom", "nbscrtibankdetails.datefrom").converter("bankDetailsDateFromCC").add()
		.fieldMap("contractDetails.billingRenewalDate", "nbscrticontracthdrdetails.billcd").converter("billingRenewalDateCC").add()
		.fieldMap("mandateDetails.effectiveDate", "nbscrtimandatedetails.effdate").converter("mandatoryEffectiveCC").add()
		.fieldMap("premiumRCTDetails.tranDate", "nbscrtipremiumrctdetails.trandatex").converter("preminumTransactionCC").add()
		.byDefault().register();
		mapper = mapperFactory.getMapperFacade();
		return mapper.map(source, targetClass);
	}
}
