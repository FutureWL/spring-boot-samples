package io.github.futurewl.thrsv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafView;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ThViewConfig {

    @Bean
    public ThymeleafViewResolver viewResolver(TemplateEngine engine) {
        // 配置解析器，设置执行顺序
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine((SpringTemplateEngine) engine);
        // 默认值为 Integer.MAX_VALUE
        viewResolver.setOrder(1);
        // 关闭缓存
        viewResolver.setCache(false);
        return viewResolver;
    }

    @Bean
    @Scope("prototype")
    public ThymeleafView testView() {
        System.out.println("=== 创建TestView ===");
        ThymeleafView view = new ThymeleafView("testView");
        // 设置公用的静态变量
        Map<String, String> staticVars = new HashMap<String, String>();
        staticVars.put("msgPrefix", "Welcome");
        view.setStaticVariables(staticVars);
        return view;
    }
}
