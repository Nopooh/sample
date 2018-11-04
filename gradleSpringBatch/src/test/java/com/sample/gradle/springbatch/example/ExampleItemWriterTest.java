package com.sample.gradle.springbatch.example;

import com.sample.gradle.springbatch.example.ExampleItemWriter;

import junit.framework.TestCase;

public class ExampleItemWriterTest extends TestCase {

	private ExampleItemWriter writer = new ExampleItemWriter();

	public void testWrite() throws Exception {
		writer.write(null); // nothing bad happens

	}

}
