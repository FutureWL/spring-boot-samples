package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.List;

public class RemoveTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        List<Product> ps = new ArrayList<Product>();
        ps.add(new Product("疯狂Java讲义"));
        ps.add(new Product("疯狂Spring Cloud"));
        ps.add(new Product("疯狂工作流讲义"));
        ctx.setVariable("products", ps);
        String result = templateEngine.process("remove/index.html", ctx);
        System.out.println(result);
    }
}
