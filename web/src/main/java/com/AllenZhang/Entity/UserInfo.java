package com.AllenZhang.entity;

public class UserInfo {
    private Integer id;

    private Integer userId;

    private String userNickName;

    private Integer balance;

    
    public UserInfo(Integer userId, String userNickName) {
		super();
	
		this.userId = userId;
		this.userNickName = userNickName;

	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}