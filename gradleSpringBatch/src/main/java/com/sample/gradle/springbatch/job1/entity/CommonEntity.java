package com.sample.gradle.springbatch.job1.entity;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CommonEntity {

	private HashMap<String, String> map = new LinkedHashMap<String,String>();

	public String get(String key) {
		String value = "";
		value = map.get(key);
		return value;
	}

	public void set(String key,String value) {
		map.put(key, value);
	}

}
