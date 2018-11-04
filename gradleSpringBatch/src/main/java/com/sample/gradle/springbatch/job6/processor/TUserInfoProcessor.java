package com.sample.gradle.springbatch.job6.processor;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.StringJoiner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import com.sample.gradle.springbatch.common.JobListener;
import com.sample.gradle.springbatch.common.entity.TUserInfo;
import com.sample.gradle.springbatch.job6.entity.PersonalInfomationEntity;

public class TUserInfoProcessor implements ItemProcessor<PersonalInfomationEntity, TUserInfo> {

	// ログ設定
	protected static final Log log = LogFactory.getLog(JobListener.class);
	// 開始日時
	private Date currentTimeStamp;
	// ユーザID
	@Value("#{jobParameters[userId]}")
	private String userId;
	// 機能ID
	private String funcId;


	@BeforeStep
	public void beforeStep(StepExecution stepExecution) {

		log.debug("beforeStep start:");

		JobExecution jobExecution = stepExecution.getJobExecution();
		ExecutionContext context = jobExecution.getExecutionContext();
		// 開始日時の取得と設定
		LocalDateTime timeStamp = (LocalDateTime)context.get("CURRENT_TIMESTAMP");
		currentTimeStamp = Date.from(timeStamp.atZone(ZoneId.systemDefault()).toInstant());
		// 機能IDの取得と設定
		funcId = (String)context.get("FUNC_ID");

		log.debug("beforeStep end: currentTimeStamp=" + currentTimeStamp + ",userId=" + userId + ",funcId=" + funcId);

	}

	@AfterStep
	public void afterStep(StepExecution stepExecution) {

		log.debug("afterStep start:");

		log.debug("afterStep end: commit count=" + stepExecution.getCommitCount());

	}


	/* (非 Javadoc)
	 * @see org.springframework.batch.item.ItemProcessor#process(java.lang.Object)
	 */
	@Override
	public TUserInfo process(PersonalInfomationEntity in) throws Exception {

		log.debug("process start:");

		TUserInfo out = new TUserInfo();
		String address = "";
		String romajiAddress = "";

		// ユーザ管理番号
		out.setUserMngNumber(in.getUserMngNumber());
		log.debug("ユーザ管理番号=:"+out.getUserMngNumber());
		// 版数
		out.setRevisionNumber(1);
		// ユーザID
		out.setUserId(in.getMailAddress());
		log.debug("ユーザID=:"+out.getUserId());
		// パスワード
		out.setPassword(in.getPassword());
		// ユーザ表示名（デフォルトはメールアドレス）
		out.setUserDispName(in.getMailAddress());
		// 姓（漢字）
		out.setKanjiFamilyName(in.getKanjiFamilyName());
		// 名（漢字）
		out.setKanjiFirstName(in.getKanjiFirstName());
		// 姓（カナ）
		out.setKanaFamilyName(in.getKanaFamilyName());
		// 名（カナ）
		out.setKanaFirstName(in.getKanaFirstName());
		// メールアドレス
		out.setMailAddress(in.getMailAddress());
		// 郵便番号
		String postCode = in.getPostalCode();
		if(postCode.length() > 7) {
			if(postCode.contains("-")) {
				postCode = postCode.replace("-", "");
			} else {
				postCode = postCode.substring(0, postCode.length()-1);
			}
		}
		out.setPostalCode(postCode);
        // 住所（漢字）
		address = editAddress(
				in.getPrefectures()
				,in.getCity()
				,in.getTownArea()
				,in.getHouseNumber()
				,in.getEtcAddress()
				);
		out.setAddress(address);
		// 住所（ローマ字）
		romajiAddress = editAddress(
				in.getRomajiPrefectures()
				,in.getRomajiCity()
				,in.getRomajiTownArea()
				,in.getRomajiHouseNumber()
				,in.getRomajiEtcAddress()
				);
		out.setAddressRomaji(romajiAddress);
		// 生年月日
		out.setBirthDate(in.getBirthDate());
		// 年齢
		out.setAge(in.getAge());
		// 性別
		out.setSex(in.getSex());
		// 電話番号
		out.setPhoneNumber(in.getPhoneNumber());
		// 携帯番号
		out.setCellphoneNumber(in.getCellphoneNumber());
		// FAX
		out.setFaxNumber(in.getFaxNumber());
		// 登録ユーザ管理番号
		out.setRegUserMngNumber(userId);
		// 登録日
		out.setRegDate(currentTimeStamp);
		// 登録機能ID
		out.setRegFuncId(funcId);
		// 更新ユーザ管理番号
		out.setUpdateUserMngNumber(userId);
		// 更新日
		out.setUpdateDate(currentTimeStamp);
		// 更新機能ID
		out.setUpdateFuncId(funcId);

		log.debug("process end: Object=" + out.toString());

		return out;
	}


	/**
	 * @param prefectures
	 * @param city
	 * @param townArea
	 * @param houseNumber
	 * @param etcAddress
	 * @return
	 */
	private String editAddress(
			String prefectures
			,String city
			,String townArea
			,String houseNumber
			,String etcAddress
			) {

		/* パラメータを編集し、文字列で返す */
		StringJoiner joiner = new StringJoiner("　");
		String result = "";

		if(!StringUtils.isEmpty(prefectures)) {
			joiner.add(prefectures);
		}
		if(!StringUtils.isEmpty(city)) {
			joiner.add(city);
		}
		if(!StringUtils.isEmpty(townArea)) {
			joiner.add(townArea);
		}
		if(!StringUtils.isEmpty(houseNumber)) {
			joiner.add(city);
		}
		if(!StringUtils.isEmpty(etcAddress)) {
			joiner.add(etcAddress);
		}

		result = joiner.toString();
		log.debug("editAddress=:" + result);

		return result;
	}

}
