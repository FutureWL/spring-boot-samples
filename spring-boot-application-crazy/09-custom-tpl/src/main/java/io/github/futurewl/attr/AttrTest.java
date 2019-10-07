package io.github.futurewl.attr;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.Date;

public class AttrTest {

    public static void main(String[] args) {
        // 创建模板引擎
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        // 设置自定义方言
        templateEngine.addDialect(new AttrDialect());
        Context ctx = new Context();
        Date now = new Date();
        ctx.setVariable("date", now);
        String result = templateEngine.process("attr/index.html", ctx);
        System.out.println(result);
    }
}
