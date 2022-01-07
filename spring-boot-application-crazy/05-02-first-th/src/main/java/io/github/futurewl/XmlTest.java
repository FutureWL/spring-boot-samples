package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.StringTemplateResolver;

public class XmlTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        // 新建模板解析器
        StringTemplateResolver resolver = new StringTemplateResolver();
        // 设置模板模式为XML
        resolver.setTemplateMode(TemplateMode.XML);
        // 将解析器设置到引擎实例中
        templateEngine.setTemplateResolver(resolver);
        Context ctx = new Context();
        // 处理一段含有Thymeleaf逻辑的XML语句
        String result = templateEngine.process(
                "<bean id=\"myBean\" th:attr='class=org.crazyi.Test'></bean>",
                ctx);
        System.out.println(result);
    }
}
