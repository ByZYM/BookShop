/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.service.impl;

import com.AllenZhang.dao.UserCartMapper;
import com.AllenZhang.entity.UserCart;
import com.AllenZhang.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CartServiceImpl implements CartService {

    @Autowired
    private UserCartMapper userCartMapper;

    @Override
    public boolean addUserCart(UserCart userCart) {
        return userCartMapper.insert(userCart)==1?true:false;
    }

    @Override
    public List<UserCart> getUserCartsByUserId(int userId) {
        return userCartMapper.selectAllByUserId(userId);
    }

    @Override
    public boolean deleteUserCartByCartId(int cartId) {
        return false;
    }

    @Override
    public boolean updateUserCartNum(UserCart userCart) {
        return false;
    }

    @Override
    public boolean submitUserCarts(List<UserCart> userCarts) {
        return false;
    }
}
