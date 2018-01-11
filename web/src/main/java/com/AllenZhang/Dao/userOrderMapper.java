package com.AllenZhang.dao;

import com.AllenZhang.entity.userOrder;

public interface userOrderMapper {
    int insert(userOrder record);

    int insertSelective(userOrder record);
}