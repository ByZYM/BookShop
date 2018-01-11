package com.AllenZhang.dao;

import com.AllenZhang.entity.BookInfo;

import java.util.List;

public interface BookInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookInfo record);

    int insertSelective(BookInfo record);

    BookInfo selectByPrimaryKey(Integer id);

    List<BookInfo> selectAll();

    int updateByPrimaryKeySelective(BookInfo record);

    int updateByPrimaryKey(BookInfo record);
}