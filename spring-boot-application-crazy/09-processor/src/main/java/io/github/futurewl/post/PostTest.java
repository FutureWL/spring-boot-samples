package io.github.futurewl.post;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class PostTest {

    public static void main(String[] args) {
        // 创建模板引擎
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        // 添加自定义的方言
        templateEngine.addDialect(new MyPostDialect());
        Context ctx = new Context();
        String result = templateEngine.process("post/index.html", ctx);
        System.out.println(result);
    }
}
