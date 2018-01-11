/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.controller.api;

import com.AllenZhang.dto.MetaDto;
import com.AllenZhang.entity.GoodsInfo;
import com.AllenZhang.service.BookService;
import com.AllenZhang.service.GoodsService;
import com.AllenZhang.utils.Status;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api/book")
public class BookController {

    @Autowired
    private GoodsService goodsService;

    private static final Log logger = LogFactory.getLog(BookController.class);

    /* 获取指定bookId的商品信息 */
    @RequestMapping(value = "/get/{bookId}")
    public @ResponseBody MetaDto getBookById(@PathVariable Integer bookId ){

    	MetaDto metaDto = new MetaDto();
        //通过id查询图书信息
    	/* 获取商品信息 */
    	GoodsInfo goodsInfo = goodsService.getGoodsByBookId(bookId);

    	if(goodsInfo==null){
    	    metaDto.setStatus(Status.FAILED);
        }else{
            metaDto.setStatus(Status.SUCCESS);
            metaDto.setData(goodsInfo);
        }


		return metaDto;
    	
    }
    

    /* 获取全部书籍 */
    @RequestMapping(value = "/get")
    public @ResponseBody
    MetaDto getAllBooks(){

        MetaDto m = new MetaDto();
        m.setMessage("获取书籍成功");
        m.setStatus(Status.SUCCESS);
        m.setData(goodsService.getAllGoods());

        return m;
    }

}
