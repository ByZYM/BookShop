/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.controller.api;

import com.AllenZhang.dto.MetaDto;
import com.AllenZhang.entity.UserCart;
import com.AllenZhang.entity.UserOrder;
import com.AllenZhang.service.OrderService;
import com.AllenZhang.utils.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/get/{userId}")
    public @ResponseBody
    MetaDto getCartById(@PathVariable("userId") Integer userId){
        MetaDto metaDto=new MetaDto();
        List<UserOrder> listCart=orderService.getAllOrdersByUserId(userId);

        if(listCart!=null){
            metaDto.setMessage("获得用户购物车订单");
            metaDto.setStatus(Status.SUCCESS);
            metaDto.setData(listCart);
        }else{
            metaDto.setMessage("未找到购物车订单");
            metaDto.setStatus(Status.FAILED);
        }
        return metaDto;
    }

}
