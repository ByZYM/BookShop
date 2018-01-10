/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.Service;

import com.AllenZhang.Entity.UserAccount;
import com.AllenZhang.Entity.UserInfo;

/**
 * 包含UserAccount与UserInfo业务逻辑
 */
public interface UserService {

    /**
     * 验证用户登录
     *
     * @param userAccount 用户账号
     * @return 验证数据库是否匹配该用户账号与密码 null表示不匹配 非null返回数据库中的值
     */
    UserAccount checkUserLogin(UserAccount userAccount);

    /**
     * 新建用户
     * 利用事务进行原子操作
     * -创建UserAccount
     * -创建UserInfo
     *
     * @param userAccount 用户账号
     * @return 是否创建成功
     */
    boolean addUser(UserAccount userAccount);

    /**
     * 更新用户账号密码
     * -只能更新用户密码
     *
     * @param userAccount 用户账号
     * @return 是否更新成功
     */
    boolean updateUserPassword(UserAccount userAccount);

    /**
     * 通过账号名称获取UserAccount
     * @param account 账号名称
     * @return null表示数据库中不存在 非null返回数据库中的UserAccount
     */
    UserAccount getUserAccountByAccount(String account);

    /**
     * 通过用户编号获取UserAccount
     * @param userId 用户编号
     * @return null表示数据库中不存在 非null返回数据库中的UserAccount
     */
    UserAccount getUserAccountByUserId(int userId);

    /**
     * 通过用户编号获取UserInfo
     * @param userId
     * @return null表示数据库中不存在 非null返回数据库中的UserInfo
     */
    UserInfo getUserInfoByUserId(int userId);

}
