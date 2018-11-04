package com.sample.gradle.springbatch.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;



/**
 * 共通コンストの定義
 * launch-context.xml経由でApprication.propertiesの値を設定
 * @author nobu
 *
 */
@Configuration
@Getter
public class CommonConst {

	@Value("${app.const.dispword}")
	private String helloWord;

	@Value("${app.const.logword}")
	private String errorWord;


}
