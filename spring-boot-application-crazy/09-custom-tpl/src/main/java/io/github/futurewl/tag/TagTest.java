package io.github.futurewl.tag;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class TagTest {

    public static void main(String[] args) {
        // 创建模板引擎
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        // 设置自定义方言
        templateEngine.addDialect(new TagDialect());
        Context ctx = new Context();
        ctx.setVariable("man", false);
        String result = templateEngine.process("tag/index.html", ctx);
        System.out.println(result);
    }
}
