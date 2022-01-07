package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.LazyContextVariable;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.List;

public class LazyTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        // 设置延迟加载
        ctx.setVariable("users", new LazyContextVariable() {
            @Override
            protected Object loadValue() {
                return getUsers();
            }
        });
        ctx.setVariable("show", true);
        String result = templateEngine.process("lazy.html", ctx);
        System.out.println(result);
    }

    static List<User> getUsers() {
        System.out.println("执行数据查询");
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Angus"));
        users.add(new User(2, "Paris"));
        return users;
    }
}
