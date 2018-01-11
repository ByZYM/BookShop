/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.controller.error;


import com.AllenZhang.dto.MetaDto;
import com.AllenZhang.utils.Status;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 用于返回Error消息
 */
@RequestMapping("/error")
@Controller
public class ErrorController {

    private static final Log logger = LogFactory.getLog(ErrorController.class);

    /* 返回登录超时信息 */
    @RequestMapping(value = "/loginTimeOut")
    public @ResponseBody
    MetaDto loginTimeoutError() {

        logger.info("登录超时");

        MetaDto m = new MetaDto();
        m.setStatus(Status.TIMEOUT);
        m.setMessage("登录超时");

        return m;
    }


}
