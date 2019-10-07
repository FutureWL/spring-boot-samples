package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class VarTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        templateEngine.setTemplateResolver(resolver);
        // 设置参数到Context中
        Context ctx = new Context();
        ctx.setVariable("data", new DataObject("angus"));
        String result = templateEngine.process("var.html", ctx);
        System.out.println(result);
    }
}
