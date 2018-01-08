package com.AllenZhang.Filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CorsFilter implements Filter {

    private String allowOrigin;
    private String allowMethods;
    private String allowCredentials;
    private String allowHeaders;
    private String exposeHeaders;

    @Override
    public void init(FilterConfig filterConfig) {
        allowOrigin = filterConfig.getInitParameter("allowOrigin");
        allowMethods = filterConfig.getInitParameter("allowMethods");
        allowCredentials = filterConfig.getInitParameter("allowCredentials");
        allowHeaders = filterConfig.getInitParameter("allowHeaders");
        exposeHeaders = filterConfig.getInitParameter("exposeHeaders");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        if (null!=allowOrigin) {
            response.setHeader("Access-Control-Allow-Origin", allowOrigin);

//            /* 处理全部站点 */
//            if (allowOrigin.equalsIgnoreCase("*")) {
//                response.setHeader("Access-Control-Allow-Origin", "*");
//            }
//            /* 处理指定站点 */
//            else {
//                List<String> allowOriginList = Arrays.asList(allowOrigin.split(","));
//                System.out.println(allowOriginList);
//                if (CollectionUtil.isNotEmpty(allowOriginList)) {
//                    String currentOrigin = request.getHeader("Origin");
//                    if (allowOriginList.contains(currentOrigin)) {
//                        response.setHeader("Access-Control-Allow-Origin", allowOrigin);
//                    }
//                }
//            }
        } if (null!=allowMethods) {
            response.setHeader("Access-Control-Allow-Methods", allowMethods);
        }
        if (null!=allowCredentials) {
            response.setHeader("Access-Control-Allow-Credentials", allowCredentials);
        }
        if (null!=allowHeaders) {
            response.setHeader("Access-Control-Allow-Headers", allowHeaders);
        }
        if (null!=exposeHeaders) {
            response.setHeader("Access-Control-Expose-Headers", exposeHeaders);
        }
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {
    }
}