package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class VisitVarTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        // 设置模板解析器
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        User user = new User();
        user.setId(1);
        user.setName("Angus");
        ctx.setVariable("user", user);
        String result = templateEngine.process("visit_var.html", ctx);
        System.out.println(result);
    }

}
