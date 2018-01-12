package com.AllenZhang.dao;

import com.AllenZhang.entity.UserOrder;

import java.util.List;

public interface UserOrderMapper {
    int insert(UserOrder record);

    Integer getMaxOrderId();

    List<UserOrder> selectAllByUserId(Integer userId);
}