package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class ClassLoaderTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        // 创建解析器
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        // 设置到模板引擎中
        templateEngine.setTemplateResolver(resolver);
        // 处理classpath下的 index.html文件
        String result = templateEngine.process("index.html", new Context());
        System.out.println(result);
    }
}
