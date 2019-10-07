package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class CssTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        ctx.setVariable("user", "Angus");
        ctx.setVariable("color", "red");
        String result = templateEngine.process("css.html", ctx);
        System.out.println(result);
    }
}
