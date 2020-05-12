package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        ctx.setVariable("user", "Angus");
        ctx.setVariable("color", "red");
        ctx.setVariable("dataUser", new User(1, "Paris"));

        List<User> users = new ArrayList<User>();
        users.add(new User(1, "userA"));
        users.add(new User(2, "userB"));
        ctx.setVariable("users", users);

        Map<String, User> map = new HashMap<String, User>();
        map.put("user1", new User(1, "userA"));
        map.put("user2", new User(2, "userB"));
        ctx.setVariable("map", map);

        String result = templateEngine.process("comment.html", ctx);
        System.out.println(result);
    }
}
