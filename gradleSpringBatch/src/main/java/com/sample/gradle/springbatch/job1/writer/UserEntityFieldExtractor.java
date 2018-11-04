package com.sample.gradle.springbatch.job1.writer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.file.transform.FieldExtractor;

import com.sample.gradle.springbatch.job1.entity.UsersEntity;

public class UserEntityFieldExtractor implements FieldExtractor<UsersEntity> {

	@Override
	public Object[] extract(UsersEntity item) {

		List<Object> values = new ArrayList<Object>();
		values.add(item.getId());
		values.add(item.getName());
		values.add(item.getAge());
		values.add(item.getBirthday());
		values.add(item.getTell());
		values.add(item.getFlag());
		values.add(item.getKey1());
		values.add(item.getKey2());
		values.add(item.getKey3());
		values.add(item.getYear());

		return values.toArray();

	}


}
