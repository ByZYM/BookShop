package com.AllenZhang.dao;

import com.AllenZhang.entity.UserAccount;

public interface UserAccountMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    UserAccount selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);
}