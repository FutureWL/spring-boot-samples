package com.wrox.site;

import org.apache.logging.log4j.ThreadContext;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;

public class PostSecurityLoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        SecurityContext context = SecurityContextHolder.getContext();
        if (context != null && context.getAuthentication() != null)
            ThreadContext.put("username", context.getAuthentication().getName());

        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}
