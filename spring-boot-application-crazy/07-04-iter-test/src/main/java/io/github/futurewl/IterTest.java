package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 算术运算符
 *
 * @author 杨恩雄
 */
public class IterTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        // 将List放到Context中
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Angus"));
        users.add(new User(2, "Paris"));
        ctx.setVariable("users", users);
        // 将Map放到Context中
        Map<String, User> userMap = new HashMap<String, User>();
        userMap.put("a", new User(3, "Angus Map"));
        userMap.put("b", new User(4, "Paris Map"));
        ctx.setVariable("userMap", userMap);
        String result = templateEngine.process("iter.html", ctx);
        System.out.println(result);
    }

}
