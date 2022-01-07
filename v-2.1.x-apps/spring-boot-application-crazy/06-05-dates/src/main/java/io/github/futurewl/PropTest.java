package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.Calendar;
import java.util.Date;

public class PropTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        ctx.setVariable("cal", Calendar.getInstance());
        ctx.setVariable("date", new Date());
        String result = templateEngine.process("prop.html", ctx);
        System.out.println(result);
    }

}
