/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.service;

import com.AllenZhang.entity.GoodsInfo;

import java.util.List;

/**
 * GoodsInfo的业务逻辑
 */
public interface GoodsService {

    List<GoodsInfo> getAllGoods();

    GoodsInfo getGoodsByBookId(Integer bookId);

}
