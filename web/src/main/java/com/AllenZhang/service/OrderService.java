/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.service;

import com.AllenZhang.entity.UserOrder;

import java.util.List;

public interface OrderService {

    List<UserOrder> getAllOrdersByUserId(Integer userId);
}
