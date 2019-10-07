package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.List;

/**
 * 算术运算符
 *
 * @author 杨恩雄
 */
public class StatusTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();

        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Angus"));
        users.add(new User(2, "Paris"));
        ctx.setVariable("users", users);

        String result = templateEngine.process("status.html", ctx);
        System.out.println(result);
    }

}
