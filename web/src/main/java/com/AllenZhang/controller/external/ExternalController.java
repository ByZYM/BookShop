/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.controller.external;

import com.AllenZhang.dto.MetaDto;
import com.AllenZhang.entity.UserAccount;
import com.AllenZhang.service.UserService;
import com.AllenZhang.utils.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 外部接口控制器(可以绕过登录过滤器)
 */
@Controller
public class ExternalController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public MetaDto loginValidate(UserAccount userAccount){

        UserAccount u = userService.checkUserLogin(userAccount);


        MetaDto metaDto = new MetaDto();

        if(u!=null){
            metaDto.setMessage("登录成功");
            metaDto.setStatus(Status.SUCCESS);
        }else{
            metaDto.setMessage("账号或密码错误");
            metaDto.setStatus(Status.FAILED);
        }

        return metaDto;
    }
}
