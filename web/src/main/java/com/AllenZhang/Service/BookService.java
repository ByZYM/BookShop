/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.service;


import com.AllenZhang.entity.BookInfo;

import java.awt.print.Book;
import java.util.List;

public interface BookService {

    boolean insert(Book book);

    List<BookInfo> getAllBooks();

}