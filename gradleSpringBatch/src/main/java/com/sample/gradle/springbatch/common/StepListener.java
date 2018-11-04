package com.sample.gradle.springbatch.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;
import org.springframework.util.StringUtils;

import lombok.Getter;
import lombok.Setter;

public class StepListener extends StepExecutionListenerSupport {

	protected static final Log log = LogFactory.getLog(StepListener.class);

	@Getter
	@Setter
	private String jobName;

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		log.info(editMsg(MessageEnum.JOBEND, jobName));
		return stepExecution.getExitStatus();
	}

	@Override
	public void beforeStep(StepExecution stepExecution) {
		log.info(editMsg(MessageEnum.JOBSTART, jobName));
	}

	private String editMsg(MessageEnum msgEnum, String jobName) {
		String message = msgEnum.getMsg();
		if (!StringUtils.isEmpty(jobName)) {
			message = message + ":" + jobName;
		}
		return message;
	}

}
