package com.sample.gradle.springbatch.job1.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.sample.gradle.springbatch.job1.entity.CommonEntity;

public class CommonFieldSetMapper implements FieldSetMapper<CommonEntity> {

	@Override
	public CommonEntity mapFieldSet(FieldSet fs) throws BindException {

		if(fs == null) {
			return null;
		}

		CommonEntity entitiy = new CommonEntity();
		String[] headerNames = fs.getNames();

		for (String headerName : headerNames) {

			entitiy.set(headerName,fs.readString(headerName));

		}

		return entitiy;

	}

}
