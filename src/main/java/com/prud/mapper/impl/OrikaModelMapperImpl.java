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
public class OrikaModelMapperImpl implements ModelMapper {

	private MapperFacade mapper;
	MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
	ConverterFactory converterFactory = mapperFactory.getConverterFactory();

	public OrikaModelMapperImpl() {
		converterFactory.registerConverter(IntegrationConstants.CUSTOM_CONVERTER_ID, new ClientDOBCustomConverter());
	}

	@SuppressWarnings("unchecked")

	public Object map(Object source, Class sourceClass, Class targetClass, Map<String, String> map) {
		ClassMapBuilder<Object, Object> classMapBilder = mapperFactory.classMap(sourceClass, targetClass);
		if (!map.isEmpty()) {
			for (Map.Entry<String, String> enrty : map.entrySet()) {
				classMapBilder.field(enrty.getKey(), enrty.getValue());
			}
		}
		classMapBilder.fieldMap("dateOfBirth", "cltdobx")
				.converter(IntegrationConstants.CUSTOM_CONVERTER_ID).add().byDefault().register();
		mapper = mapperFactory.getMapperFacade();
		return mapper.map(source, targetClass);
	}
}
