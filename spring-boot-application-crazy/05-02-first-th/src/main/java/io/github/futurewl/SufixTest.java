package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class SufixTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        // 设置前缀与后缀
        ClassLoaderTemplateResolver resolover = new ClassLoaderTemplateResolver();
        resolover.setPrefix("/templates/");
        resolover.setSuffix(".html");
        templateEngine.setTemplateResolver(resolover);
        // 处理 /templates/index.html
        String result = templateEngine.process("index", new Context());
        System.out.println(result);
    }

}
