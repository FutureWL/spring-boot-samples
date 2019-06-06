package io.github.futurewl.spring.boot.demo1.mvc.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述：Session 拦截器
 *
 * @author weilai create by 2019-06-06:11:47
 * @version 1.0
 */
@Component
public class SessionHandlerInterceptor implements HandlerInterceptor {

    // 调用 Controller 方法前调用
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 案例 可在此判断是否登录，如未登录则跳转到登录页面

        return true;
    }

    // 调用 Controller 方法结束后、页面渲染前调用
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    // 页面渲染完毕后调用此方法
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
