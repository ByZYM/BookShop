package com.AllenZhang.Dao;

import com.AllenZhang.Entity.GoodsInfo;

public interface GoodsInfoMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);
}