package io.github.futurewl.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(value = "/filter/*")
public class MyFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("my filter init");
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter method");
        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
