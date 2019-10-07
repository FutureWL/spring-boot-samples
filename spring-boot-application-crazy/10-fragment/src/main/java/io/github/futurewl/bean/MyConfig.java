package io.github.futurewl.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafView;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

@Configuration
public class MyConfig {

    @Bean
    public ThymeleafViewResolver viewResolver(TemplateEngine engine) {
        // 配置解析器，设置执行顺序
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine((SpringTemplateEngine) engine);
        viewResolver.setOrder(1);
        viewResolver.setCharacterEncoding("UTF-8");
        return viewResolver;

    }

    @Bean(name = "foot")
    @Scope("prototype")
    public ThymeleafView footView() {
        // 创建视图对象
        ThymeleafView view = new ThymeleafView("common");
        // 设置选中 commonFooter 片断
        view.setMarkupSelector("commonFooter");
        return view;
    }

    @Bean(name = "head")
    @Scope("prototype")
    public ThymeleafView headView() {
        // 创建视图对象
        ThymeleafView view = new ThymeleafView("common");
        // 设置选中 commonHead 片断
        view.setMarkupSelector("commonHead");
        return view;
    }
}
