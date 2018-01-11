/*
 * Copyright (c) 2017 by AllenZhang
 */

package com.AllenZhang.filter;

import com.AllenZhang.entity.UserAccount;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
 * 登录验证过滤器
 *
 *
 * */
public class LoginFilter implements Filter {

    private static final Log logger = LogFactory.getLog(LoginFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;

        /* 如果不是ajax测试连接方法 */
        if (!httpRequest.getMethod().equalsIgnoreCase("options")) {
            HttpSession session = httpRequest.getSession();

            UserAccount userAccount = (UserAccount) session.getAttribute("userAccount");

            //ajax session 过期处理
            if (userAccount == null) {
                logger.info("session过期处理");
                logger.info("请求重定向到/error/loginTimeOut");
                /* 重定向到errorController返回消息 */
                httpResponse.sendRedirect("/error/loginTimeOut");
                return;

            }
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
