package com.sample.gradle.springbatch.example;

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
//@ContextConfiguration(locations={"/example/example-launch-context.xml"})
@Getter
public class ExampleCommonConst {

	@Value("${app.const.dispword}")
	private String helloWord;

	@Value("${app.const.logword}")
	private String errorWord;


}
