package io.github.futurewl.exe;

import io.github.futurewl.exe.post.MyPostDialect;
import io.github.futurewl.exe.pre.MyPreDialect;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class ExeTest {

    public static void main(String[] args) {
        // 创建模板引擎
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(new ClassLoaderTemplateResolver());
        // 设置自定义方言
        templateEngine.addDialect(new MyExeAttrDialect());
        templateEngine.addDialect(new MyProcessorDialect());
        templateEngine.addDialect(new MyPreDialect());
        templateEngine.addDialect(new MyPostDialect());
        Context ctx = new Context();
        String result = templateEngine.process("exe/index.html", ctx);
        System.out.println(result);
    }
}
