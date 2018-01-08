package com.AllenZhang.Dao;

import com.AllenZhang.Entity.UserCart;

public interface UserCartMapper {
    int deleteByPrimaryKey(Integer cartId);

    int insert(UserCart record);

    int insertSelective(UserCart record);

    UserCart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(UserCart record);

    int updateByPrimaryKey(UserCart record);
}