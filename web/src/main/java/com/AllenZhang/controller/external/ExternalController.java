/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.controller.external;

import com.AllenZhang.dto.LoginViewDto;
import com.AllenZhang.dto.MetaDto;
import com.AllenZhang.dto.SignViewDto;
import com.AllenZhang.entity.UserAccount;
import com.AllenZhang.service.UserService;
import com.AllenZhang.utils.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


/**
 * 外部接口控制器(可以绕过登录过滤器)
 */
@Controller
public class ExternalController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public @ResponseBody MetaDto loginValidate(@RequestBody LoginViewDto loginViewDto, HttpSession session) {

        System.out.println(loginViewDto);

        UserAccount u = userService.checkUserLogin(loginViewDto.getAccount(),loginViewDto.getPassword());
        MetaDto metaDto = new MetaDto();

        if (u != null) {
            /* Session持久化 */
            session.setAttribute("userAccount",u);
            metaDto.setMessage("登录成功");
            metaDto.setStatus(Status.SUCCESS);
            metaDto.setData(u);
        } else {
            metaDto.setMessage("账号或密码错误");
            metaDto.setStatus(Status.FAILED);
        }

        return metaDto;
    }

    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public @ResponseBody
    MetaDto addUser(@RequestBody SignViewDto signViewDto) {

        MetaDto metaDto = new MetaDto();
        String account = signViewDto.getAccount();
        String password = signViewDto.getPassword();
        UserAccount userAccount = new UserAccount(account, password);

        try{
            /* 自动添加了UserAccount和UserInfo */
            userService.addUser(userAccount);

            metaDto.setMessage("注册成功");
            metaDto.setStatus(Status.SUCCESS);

        }catch(RuntimeException e){
            metaDto.setMessage("注册失败");
            metaDto.setStatus(Status.FAILED);
        }

        return metaDto;
    }
}
