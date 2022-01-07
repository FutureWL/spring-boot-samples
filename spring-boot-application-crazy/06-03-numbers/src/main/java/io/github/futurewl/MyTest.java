package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        // 设置模板解析器
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        ctx.setVariable("one", 99);
        ctx.setVariable("two", 999999999);
        ctx.setVariable("three", 9999.9999);
        ctx.setVariable("from", 10);
        ctx.setVariable("to", 20);


        ctx.setVariable("user", new User(1, "angus young"));

        ctx.setVariable("xml", "<div>test</div>");
        ctx.setVariable("jaba", "\\abc");
        ctx.setVariable("jaba2", "\u0041");

        List<String> arrs = new ArrayList<String>();
        arrs.add("a");
        arrs.add("");
        arrs.add("c");
        ctx.setVariable("arrs", arrs);


        String result = templateEngine.process("test.html", ctx);
        System.out.println(result);


    }

}
