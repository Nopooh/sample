package com.sample.gradle.springbatch.common.entity;

import java.io.Serializable;

public class UsersKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column users.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table users
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column users.id
	 * @return  the value of users.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column users.id
	 * @param id  the value for users.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}