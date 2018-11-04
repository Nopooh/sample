package com.sample.gradle.springbatch.job8.reader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.Setter;

public class ReaderStepListener extends StepExecutionListenerSupport {

	protected static final Log log = LogFactory.getLog(ReaderStepListener.class);

	@Getter
	@Setter
	private String jobName;

	@Value("#{jobParameters[inId]}")
	private String inId;

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		return stepExecution.getExitStatus();
	}

	@Override
	public void beforeStep(StepExecution stepExecution) {
		JobParameters jobparams = stepExecution.getJobParameters();
		log.info("inId=:" + inId);
		log.info("id  =:" + jobparams.getString("inId"));
		ExecutionContext context = stepExecution.getExecutionContext();
		context.putString("inId", inId);

	}

}
