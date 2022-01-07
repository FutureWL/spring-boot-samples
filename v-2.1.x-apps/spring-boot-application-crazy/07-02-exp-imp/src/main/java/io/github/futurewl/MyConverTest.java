package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.standard.StandardDialect;
import org.thymeleaf.standard.expression.IStandardConversionService;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class MyConverTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        // 创建自定义转换类
        IStandardConversionService customConversionService = new MyConverService();
        // 设置自定义转换类
        StandardDialect dialect = new StandardDialect();
        dialect.setConversionService(customConversionService);
        templateEngine.setDialect(dialect);
        // 设置用户参数
        Context ctx = new Context();
        ctx.setVariable("user", new User("Angus", 33));
        String result = templateEngine.process("my-conver.html", ctx);
        System.out.println(result);
    }

}
