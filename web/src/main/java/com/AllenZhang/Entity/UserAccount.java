package com.AllenZhang.entity;

import java.util.Date;

public class UserAccount {
    private Integer userId;

    private String account;

    private String password;

    private Date loginTime;

    public UserAccount(){
        
    }

    public UserAccount(String account, String password) {
		super();
		this.account = account;
		this.password = password;
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

    @Override
    public String toString() {
        return "UserAccount{" + "userId=" + userId + ", account='" + account + '\'' + ", password='" + password + '\'' + ", loginTime=" + loginTime + '}';
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}