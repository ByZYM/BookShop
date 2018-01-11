/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.service.impl;

import com.AllenZhang.entity.UserAccount;
import com.AllenZhang.entity.UserInfo;
import com.AllenZhang.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserAccount checkUserLogin(UserAccount userAccount) {
        return null;
    }

    @Override
    public boolean addUser(UserAccount userAccount) {
        return false;
    }

    @Override
    public boolean updateUserPassword(UserAccount userAccount) {
        return false;
    }

    @Override
    public UserAccount getUserAccountByAccount(String account) {
        return null;
    }

    @Override
    public UserAccount getUserAccountByUserId(int userId) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByUserId(int userId) {
        return null;
    }
}
