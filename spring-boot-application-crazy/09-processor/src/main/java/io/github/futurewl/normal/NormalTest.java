package io.github.futurewl.normal;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class NormalTest {

    public static void main(String[] args) {
        // 创建模板引擎
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        // 添加自定义的方言
        templateEngine.addDialect(new MyProcessorDialect());
        Context ctx = new Context();
        String result = templateEngine.process("normal/index.html", ctx);
        System.out.println(result);
    }
}
