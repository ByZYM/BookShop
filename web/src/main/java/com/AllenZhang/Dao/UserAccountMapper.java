package com.AllenZhang.Dao;

import com.AllenZhang.Entity.UserAccount;

public interface UserAccountMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    UserAccount selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);
}