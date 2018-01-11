/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.dto;

/**
 * 用户登录传输对象
 */
public class LoginViewDto {

    private String account;

    private String password;

    @Override
    public String toString() {
        return "LoginViewDto{" + "account='" + account + '\'' + ", password='" + password + '\'' + '}';
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
}
