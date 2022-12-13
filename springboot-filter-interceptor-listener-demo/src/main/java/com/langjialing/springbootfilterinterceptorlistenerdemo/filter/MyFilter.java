package com.langjialing.springbootfilterinterceptorlistenerdemo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


/**
 * @author 郎家岭伯爵
 */
@WebFilter(urlPatterns = "/myfilter/hello0", filterName = "myfilter")
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        chain.doFilter(request,response);
        System.out.println("MyFilter Execute cost="+(System.currentTimeMillis()-start));
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}