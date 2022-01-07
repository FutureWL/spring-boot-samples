package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class RefTest {

    public static void main(String[] args) {
        // 设置模板解析器
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        // 设置使用逻辑分离
        resolver.setUseDecoupledLogic(true);
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(resolver);
        // 设置集合参数
        Context ctx = new Context();
        ctx.setVariable("user", "Angus");
        String result = templateEngine.process("ref/index.html", ctx);
        System.out.println(result);
    }
}
