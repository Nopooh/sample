package com.sample.gradle.springbatch.job1.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.sample.gradle.springbatch.job1.entity.UsersEntity;

public class UsersFieldSetMapper implements FieldSetMapper<UsersEntity> {

	@Override
	public UsersEntity mapFieldSet(FieldSet fs) throws BindException {

		if(fs == null) {
			return null;
		}

		UsersEntity entitiy = new UsersEntity();
		entitiy.setId(fs.readString("id"));
		entitiy.setName(fs.readString("name"));
		entitiy.setAge(fs.readString("age"));
		entitiy.setBirthday(fs.readString("birthday"));
		entitiy.setTell(fs.readString("tell"));
		entitiy.setFlag(fs.readString("flag"));
		entitiy.setKey1(fs.readString("key1"));
		entitiy.setKey2(fs.readString("key2"));
		entitiy.setKey3(fs.readString("key3"));
		entitiy.setYear(fs.readString("year"));
		return entitiy;

	}

}
