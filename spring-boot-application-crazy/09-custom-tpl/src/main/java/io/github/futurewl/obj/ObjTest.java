package io.github.futurewl.obj;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class ObjTest {

    public static void main(String[] args) {
        // 创建模板引擎
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        // 设置自定义方言
        templateEngine.addDialect(new MyExpDialect());
        Context ctx = new Context();
        String result = templateEngine.process("attr/index.html", ctx);
        System.out.println(result);
    }
}
