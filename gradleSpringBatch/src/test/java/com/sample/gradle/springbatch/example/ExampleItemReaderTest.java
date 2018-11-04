package com.sample.gradle.springbatch.example;

import com.sample.gradle.springbatch.example.ExampleItemReader;

import junit.framework.TestCase;

public class ExampleItemReaderTest extends TestCase {

	private ExampleItemReader reader = new ExampleItemReader();

	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", reader.read());
	}

	public void testReadTwice() throws Exception {
		reader.read();
		assertEquals(null, reader.read());
	}

}
