/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.service.impl;

import com.AllenZhang.dao.UserCartMapper;
import com.AllenZhang.dao.UserOrderMapper;
import com.AllenZhang.entity.UserCart;
import com.AllenZhang.entity.UserOrder;
import com.AllenZhang.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private UserCartMapper userCartMapper;

    @Autowired
    private UserOrderMapper userOrderMapper;

    @Override
    public boolean addUserCart(UserCart userCart) {
        return userCartMapper.insert(userCart) == 1 ? true : false;
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
    @Transactional
    public void submitUserCarts(List<UserCart> userCarts) throws RuntimeException {
        for (UserCart cart : userCarts) {
            /* 购物车提交 */
            cart.setIsCommit("已提交");
            if (userCartMapper.updateByCartId(cart) == 0) throw new RuntimeException("无法更新购物车");
            UserOrder userOrder = new UserOrder();
            userOrder.setUserCart(cart);
            userOrder.setOrderId(userOrderMapper.getMaxOrderId() + 1);

            /* 添加订单 */
            if (userOrderMapper.insert(userOrder)==0)throw new RuntimeException("无法插入订单");

        }

    }
}
