package com.AllenZhang.Dao;

import com.AllenZhang.Entity.userOrder;

public interface userOrderMapper {
    int insert(userOrder record);

    int insertSelective(userOrder record);
}