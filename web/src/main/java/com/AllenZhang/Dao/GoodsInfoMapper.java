package com.AllenZhang.dao;

import com.AllenZhang.entity.GoodsInfo;

import java.util.List;

public interface GoodsInfoMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);

    /* 联合查询 */
    List<GoodsInfo> selectAllWithAllData();


    GoodsInfo selectByIdWithAllData(Integer bookId);

}