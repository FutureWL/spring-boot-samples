package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DecimalTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        Double[] arr = new Double[]{10.522, 100.99999};
        List list = Arrays.asList(arr);
        Set set = new HashSet(list);
        ctx.setVariable("arr", arr);
        ctx.setVariable("list", list);
        ctx.setVariable("set", set);
        String result = templateEngine.process("decimal.html", ctx);
        System.out.println(result);
    }

}
