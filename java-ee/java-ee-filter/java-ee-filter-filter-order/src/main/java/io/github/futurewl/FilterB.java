package io.github.futurewl;

import javax.servlet.*;
import java.io.IOException;

public class FilterB implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("Entering FilterB.doFilter().");
        chain.doFilter(request, response);
        System.out.println("Leaving FilterB.doFilter().");
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}
