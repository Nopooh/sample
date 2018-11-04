package com.sample.gradle.springbatch.example;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 * Dummy {@link ItemWriter} which only logs data it receives.
 */
@Component("exampleWriter")
public class ExampleItemWriter implements ItemWriter<Object> {

	private static final Log log = LogFactory.getLog(ExampleItemWriter.class);

	/* 共通コンストの定義 */
	@Autowired
	private ExampleCommonConst cConst;

	/**
	 * @see ItemWriter#write(java.util.List)
	 */
	public void write(List<? extends Object> data) throws Exception {
		log.info(data);
		log.info(cConst.getHelloWord());
	}

}
