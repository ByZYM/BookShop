package com.AllenZhang.dto;

public class SignViewDto {
	private int userId;
	private String account;
	private String password;
	private String userNickName;
	
	public SignViewDto() {
		super();
	}



	public SignViewDto(int userId, String account, String password, String userNickName) {
		super();
		this.userId = userId;
		this.account = account;
		this.password = password;
		this.setUserNickName(userNickName);
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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
