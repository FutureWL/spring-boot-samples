package io.github.futurewl.resolver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.TemplateEngine;

@Configuration
public class ViewConfig {

    /**
     * 创建自定义的视图处理器
     *
     * @param templateEngine
     * @return
     */
    @Bean
    public MyViewResolver myViewResolver(TemplateEngine templateEngine) {
        MyViewResolver resolver = new MyViewResolver();
        resolver.setTemplateEngine(templateEngine);
        return resolver;
    }

}
