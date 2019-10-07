package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.List;

public class CommentTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "UserA"));
        users.add(new User(2, "UserB"));
        ctx.setVariable("users", users);
        String result = templateEngine.process("comment.html", ctx);
        System.out.println(result);
    }
}
