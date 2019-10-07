package io.github.futurewl.pre;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class PreTest {

    public static void main(String[] args) {
        // 创建模板引擎
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        // 添加自定义的方言
        templateEngine.addDialect(new MyPreDialect());
        Context ctx = new Context();
        String result = templateEngine.process("pre/index.html", ctx);
        System.out.println(result);
    }
}
