/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.Service;

import com.AllenZhang.Entity.UserCart;

import java.util.List;

/**
 * UserCart的业务逻辑
 */
public interface CartService {

    /**
     * 插入购物车商品
     *
     * @param userCart 用户购物车商品
     * @return 是否添加成功
     */
    boolean addUserCart(UserCart userCart);

    /**
     * 通过用户编号获取用户购物车全部商品
     *
     * @param userId 用户编号
     * @return null表示数据库中不存在 非null返回数据库中的UserCart
     */
    List<UserCart> getUserCartsByUserId(int userId);

    /**
     * 通过用户购物车编号删除用户购物车商品
     *
     * @param cartId 用户购物车编号
     * @return 是否删除成功
     */
    boolean deleteUserCartByCartId(int cartId);

    /**
     * 更新用户购物车商品
     * -只能更新商品数量
     *
     * @param userCart
     * @return
     */
    boolean updateUserCartNum(UserCart userCart);


    /**
     * 提交用户购物车商品
     * 利用事务进行原子操作
     * -更新购物车商品状态
     * -插入用户订单
     * @param userCarts 要提交的订单系列
     * @return
     */
    boolean submitUserCarts(List<UserCart> userCarts);

}
