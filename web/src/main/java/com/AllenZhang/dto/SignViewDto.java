package com.AllenZhang.dto;

public class SignViewDto {
	private Integer userId;
	private String account;
	private String password;
	private String userNickName;
	
	public SignViewDto() {
		super();
	}



	public SignViewDto(Integer userId, String account, String password, String userNickName) {
		super();
		this.userId = userId;
		this.account = account;
		this.password = password;
		this.setUserNickName(userNickName);
	}



	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getUserNickName() {
		return userNickName;
	}



	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}



}
