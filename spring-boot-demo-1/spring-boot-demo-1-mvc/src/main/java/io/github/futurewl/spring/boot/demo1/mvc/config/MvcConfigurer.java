package io.github.futurewl.spring.boot.demo1.mvc.config;

import io.github.futurewl.spring.boot.demo1.mvc.interceptor.SessionHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 功能描述：Mvc 配置
 *
 * @author weilai create by 2019-06-06:11:44
 * @version 1.0
 */
@Configuration
public class MvcConfigurer implements WebMvcConfigurer {

    private final SessionHandlerInterceptor sessionHandlerInterceptor;

    public MvcConfigurer(SessionHandlerInterceptor sessionHandlerInterceptor) {
        this.sessionHandlerInterceptor = sessionHandlerInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截器
        registry.addInterceptor(sessionHandlerInterceptor);
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        // 格式化
        // 讲 HTTP 请求映射到 controller 方法上后，Spring 会进行自动类型转化
        // 对于 日期类型的参数，Spring 默认并没有配置如何讲字符串转化为 日期类型。
        // 为了支持可按照指定格式转化为日期类型，需要添加一个 Date Formatter 类
        registry.addFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 跨域访问配置
        registry
                .addMapping("/**")
        // 精细化控制
        // .allowedOrigins("http://domain2.com")
        // .allowedMethods("POST", "GET")
        ;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // URI 到视图的映射
        registry.addViewController("/index.html").setViewName("/index.btl");
        // 所有 以 .do 结尾的请求重定向到 /index.html 请求
        registry.addRedirectViewController("/**/*.do", "/index.html");
    }

    // 其他更多全局定制化接口
}
