/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.service.impl;

import com.AllenZhang.dao.UserOrderMapper;
import com.AllenZhang.entity.UserOrder;
import com.AllenZhang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserOrderMapper userOrderMapper;

    @Override
    public List<UserOrder> getAllOrdersByUserId(Integer userId) {
        return userOrderMapper.selectAllByUserId(userId);
    }

}
