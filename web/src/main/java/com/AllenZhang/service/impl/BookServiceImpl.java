/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.service.impl;

import com.AllenZhang.dao.BookInfoMapper;
import com.AllenZhang.entity.BookInfo;
import com.AllenZhang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Override
    public boolean insert(Book book) {
        return false;
    }

    @Override
    public List<BookInfo> getAllBooks() {
        List<BookInfo> returnData = bookInfoMapper.selectAll();

        return returnData;
    }
}
