package io.github.futurewl.bondary;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class BondaryTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        templateEngine.addDialect(new BondaryDialect());

        Context ctx = new Context();
        String result = templateEngine.process("bondary/index.html", ctx);
        System.out.println(result);
    }

}
