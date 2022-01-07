package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MixVarTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        // 设置模板解析器
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        // 设置User的Parent属性
        User user = new User();
        Parent parent = new Parent();
        parent.setAge(10);
        user.setParent(parent);
        ctx.setVariable("user", user);
        // 设置集合变量
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Angus.L"));
        users.add(new User(2, "Paris.L"));
        ctx.setVariable("users", users);
        // 设置Map变量
        Map<String, User> userMap = new HashMap<String, User>();
        userMap.put("key1", new User(1, "Angus.M"));
        userMap.put("key2", new User(2, "Paris.M"));
        ctx.setVariable("userMap", userMap);
        // 设置数组
        User[] userArr = new User[]{new User(1, "Angus.A"), new User(2, "Paris.A")};
        ctx.setVariable("userArr", userArr);
        String result = templateEngine.process("mix_var.html", ctx);
        System.out.println(result);
    }

}
