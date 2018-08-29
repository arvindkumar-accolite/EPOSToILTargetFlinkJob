package com.prud.translator;

import java.util.List;
import java.util.Map;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JsonValueExtractor {
	
	DocumentContext jsonContext;

	public JsonValueExtractor(String content) {
		jsonContext = JsonPath.parse(content);
	}
	
	public String fetchString(String jsonPath){
		return jsonContext.read(jsonPath);
	}
	public int fetchInt(String jsonPath){
		return jsonContext.read(jsonPath);
	}
	public List<String> fetchListOfString(String jsonPath){
		return jsonContext.read(jsonPath);
	}
	public Map<String,String> fetchMapString(String jsonPath){
		return jsonContext.read(jsonPath);
	}
	public List<Object> fetchListObject(String jsonPath){
		List<Object> l = jsonContext.read(jsonPath);
		for(int i =0; i<l.size();i++) {
			System.out.println((String)jsonContext.read(jsonPath+"["+i+"]"+".type"));
		}
		return l;
	}
	
}
