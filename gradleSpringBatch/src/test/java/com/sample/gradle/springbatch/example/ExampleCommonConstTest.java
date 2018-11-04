package com.sample.gradle.springbatch.example;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sample.gradle.springbatch.example.ExampleCommonConst;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/example/example-launch-context.xml"})
public class ExampleCommonConstTest {

	@Autowired
	private ExampleCommonConst cConst;

	@Test
	public void testSimpleProperties() throws Exception {
		//assertNotNull(cConst);
		assertThat(cConst,is(notNullValue()));
	}

	@Test
	public void testGetHelloWord() throws Exception {
		//System.out.println("console:" + cConst.getHelloWord());
		assertThat(cConst.getHelloWord(),is("Example: Hello Wolrd by const"));
		//assertEquals("Hello Wolrd by const",cConst.getHelloWord());
	}

	@Test
	public void testGetErrorWord() throws Exception {
		assertThat(cConst.getErrorWord(),is("Example: error World"));
	}

}
