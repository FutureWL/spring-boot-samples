package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.Locale;

public class I18nTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        // 创建解析器
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        // 设置到模板引擎中
        templateEngine.setTemplateResolver(resolver);
        // 处理classpath下的  html 文件
        Context ctx = new Context();
        // 本机默认的Local为  zh、CN
        Locale maLocale = new Locale("zh", "CN", "ma");
        ctx.setLocale(maLocale);
        String result = templateEngine.process("i18n.html", ctx);
        System.out.println("使用zh_CN-ma.properties文件：" + result);
        // ============  使用新的 Locale  ============
        Context ctx2 = new Context();
        Locale dbLocale = new Locale("zh", "CN", "db");
        ctx2.setLocale(dbLocale);
        result = templateEngine.process("i18n.html", ctx2);
        System.out.println("使用zh_CN-db.properties文件：" + result);
    }

}
