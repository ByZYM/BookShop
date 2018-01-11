package com.AllenZhang.dao;

import com.AllenZhang.entity.UserCart;

import java.util.List;

public interface UserCartMapper {
    int deleteByPrimaryKey(Integer cartId);

    int insert(UserCart record);

    int insertSelective(UserCart record);

    UserCart selectByCartId(Integer cartId);

    List<UserCart> selectAllByUserId(Integer userId);

    int updateByCartIdSelective(UserCart record);

    int updateByCartId(UserCart record);
}