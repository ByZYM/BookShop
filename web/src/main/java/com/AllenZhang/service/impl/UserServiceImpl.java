/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.service.impl;

import com.AllenZhang.dao.UserAccountMapper;
import com.AllenZhang.dao.UserInfoMapper;
import com.AllenZhang.entity.UserAccount;
import com.AllenZhang.entity.UserInfo;
import com.AllenZhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    /*  自动注入用户账号dao */
    @Autowired
    private UserAccountMapper userAccountMapper;

    /*  自动注入用户信息dao */
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserAccount checkUserLogin(UserAccount userAccount) {

        /* 根据账号查询到UserAccount */
        UserAccount u = userAccountMapper.selectByUserAccount(userAccount.getAccount());

        /* 账号不存在 */
        if(u==null){
            return null;
        }
        /* 密码不匹配 */
        else if(!u.getPassword().equals(userAccount.getPassword())){
            return null;
        }

        /* 查询成功 */
        return u;

    }

    /**
     * 利用事务管理
     *
     * 抛出异常则注册错误
     * @param userAccount 用户账号
     * @return
     */
    @Override
    @Transactional
    public void addUser(UserAccount userAccount) throws RuntimeException {
        if(userAccountMapper.insert(userAccount)==0)throw new RuntimeException("添加用户账户错误");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userAccount.getUserId());
        /* 初始化余额 */
        userInfo.setBalance(1000);

        if(userInfoMapper.insert(userInfo)==0) {
            throw new RuntimeException("添加用户信息错误");
        }
    }

    @Override
    public boolean updateUserPassword(UserAccount userAccount) {
        return false;
    }

    @Override
    public UserAccount getUserAccountByAccount(String account) {
        return userAccountMapper.selectByUserAccount(account);
    }

    @Override
    public UserAccount getUserAccountByUserId(int userId) {
        return userAccountMapper.selectByPrimaryKey(userId);
    }

    @Override
    public UserInfo getUserInfoByUserId(int userId) {
        return null;
    }
}
