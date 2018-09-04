package com.pru.mapper;

import java.util.Map;

public interface ModelMapper {

	Object map(Object source, Class sourceClass, Class targetClass, Map<String, String> map);
}
