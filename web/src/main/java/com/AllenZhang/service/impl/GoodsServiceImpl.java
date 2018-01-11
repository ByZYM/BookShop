/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.service.impl;

import com.AllenZhang.dao.GoodsInfoMapper;
import com.AllenZhang.entity.GoodsInfo;
import com.AllenZhang.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsInfoMapper goodsInfoMapper;

    @Override
    public List<GoodsInfo> getAllGoods() {
        List<GoodsInfo> returnData = goodsInfoMapper.selectAllWithAllData();
        return returnData;
    }

    @Override
    public GoodsInfo getGoodsByBookId(Integer bookId) {
        return goodsInfoMapper.selectByIdWithAllData(bookId);
    }
}
