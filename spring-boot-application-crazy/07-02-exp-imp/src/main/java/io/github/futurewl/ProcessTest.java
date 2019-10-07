package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * 算术运算符
 *
 * @author 杨恩雄
 */
public class ProcessTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        Context ctx = new Context();
        User u = new User("key1");
        ctx.setVariable("user", u);

        String result = templateEngine.process("process.html", ctx);
        System.out.println(result);
    }

}
