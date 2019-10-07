package io.github.futurewl;

import io.github.futurewl.dialect.TagDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.TemplateEngine;

import javax.annotation.PostConstruct;

@Configuration
public class MyConfig {

    @Autowired
    TemplateEngine templateEngine;

    @PostConstruct
    public void init() {
        // 为模板引擎设置方言对象
        TagDialect myTabDialect = myTabDialect();
        templateEngine.addDialect(myTabDialect);
    }

    /**
     * 创建一个自定义方言bean
     */
    @Bean
    public TagDialect myTabDialect() {
        return new TagDialect();
    }
}
