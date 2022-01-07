package io.github.futurewl.others;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class OthersTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        templateEngine.addDialect(new OthersDialect());

        Context ctx = new Context();
        String result = templateEngine.process("others/index.html", ctx);
        System.out.println(result);
    }

}
