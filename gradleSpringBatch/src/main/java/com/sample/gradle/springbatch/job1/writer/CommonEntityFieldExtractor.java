package com.sample.gradle.springbatch.job1.writer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.file.transform.FieldExtractor;

import com.sample.gradle.springbatch.job1.entity.CommonEntity;

import lombok.Getter;
import lombok.Setter;


public class CommonEntityFieldExtractor implements FieldExtractor<CommonEntity> {

	@Getter
	@Setter
	private String[] names;

	@Override
	public Object[] extract(CommonEntity item) {

		List<Object> values = new ArrayList<Object>();

		for(String name : names) {
			values.add(item.get(name));
		}

		return values.toArray();

	}


}
