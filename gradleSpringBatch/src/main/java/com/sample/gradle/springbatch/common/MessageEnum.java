package com.sample.gradle.springbatch.common;

import lombok.Getter;

public enum MessageEnum {


	JOBSTART("MSGID-I0001","ジョブ開始"),
	JOBEND("MSGID-0002","ジョブ終了");

	@Getter
	private final String msgId;
	@Getter
	private final String msg;

	MessageEnum(String msgId,String msg) {
		this.msgId= msgId;
		this.msg = msg;
	}

}
