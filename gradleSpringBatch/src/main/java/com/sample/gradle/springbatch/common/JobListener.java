package com.sample.gradle.springbatch.common;

import java.time.LocalDateTime;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.util.StringUtils;

import lombok.Getter;
import lombok.Setter;

public class JobListener extends JobExecutionListenerSupport {
	protected static final Log log = LogFactory.getLog(JobListener.class);

	@Getter
	@Setter
	private String jobName;

	@Override
	public void afterJob(JobExecution jobExecution) {
		log.info(editMsg(MessageEnum.JOBEND, jobName));
	}

	@Override
	public void beforeJob(JobExecution jobExecution) {
		LocalDateTime currentTimeStamp = LocalDateTime.now();

		log.info(editMsg(MessageEnum.JOBSTART, jobName));

		// 登録日付の取得とコンテキストへの設定
		ExecutionContext context = jobExecution.getExecutionContext();
		context.put("CURRENT_TIMESTAMP",currentTimeStamp);
		context.put("FUNC_ID", jobName);

	}

	private String editMsg(MessageEnum msgEnum, String jobName) {
		String message = msgEnum.getMsg();
		if (!StringUtils.isEmpty(jobName)) {
			message = message + ":" + jobName;
		}
		return message;
	}

}
