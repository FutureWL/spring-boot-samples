package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();

        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("c");
        list1.add("b");
        ctx.setVariable("list1", list1);
        ctx.setVariable("com", new MyComparator());

        String result = templateEngine.process("list.html", ctx);
        System.out.println(result);
    }

}
