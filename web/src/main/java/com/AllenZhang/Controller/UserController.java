/*
 * Copyright (c) 2017 by AllenZhang
 */

package com.AllenZhang.Controller;

import com.AllenZhang.Dto.MetaDto;
import com.AllenZhang.Entity.UserAccount;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

@RequestMapping(value = "/account")
public class UserController {


    private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public @ResponseBody
    MetaDto login(@RequestBody UserAccount user){
        logger.info(user);

        MetaDto m = new MetaDto();
        m.setMessage("哈哈哈");

        return m;
    }

    @RequestMapping(value = "/newUser",method = {RequestMethod.POST})
    public @ResponseBody
    MetaDto newUser(@RequestBody UserAccount user){

        logger.info(user);

        boolean isSuccess =  true;

        MetaDto m = new MetaDto();
        if(isSuccess){
            m.setMessage("成功添加User");
        }else{
            m.setMessage("失败");
        }

        return m;
    }

}
