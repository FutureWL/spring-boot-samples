package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class VarTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        // 设置模板解析器
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        ctx.setVariable("userName", "Angus");
        String result = templateEngine.process("var.html", ctx);
        System.out.println(result);
    }

}
