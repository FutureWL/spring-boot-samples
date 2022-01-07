package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        String[] arr = new String[]{"abc", "def"};
        ctx.setVariable("arr", arr);

        List<String> list = new ArrayList<String>();
        list.add("c");
        list.add("d");
        ctx.setVariable("list", list);

        String[] strArr = new String[]{"e", "f"};
        ctx.setVariable("strArr", strArr);

        List<String> strList = new ArrayList<String>();
        strList.add("abc");
        strList.add("def");
        ctx.setVariable("strList", strList);


        String result = templateEngine.process("array.html", ctx);
        System.out.println(result);
    }
}
