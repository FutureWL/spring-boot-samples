package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.List;

public class DecoupleTest {

    public static void main(String[] args) {
        // 设置模板解析器
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        // 设置使用逻辑分离
        resolver.setUseDecoupledLogic(true);
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(resolver);
        // 设置集合参数
        Context ctx = new Context();
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Angus"));
        users.add(new User(2, "Paris"));
        ctx.setVariable("users", users);
        String result = templateEngine.process("decouple/index.html", ctx);
        System.out.println(result);
    }
}
