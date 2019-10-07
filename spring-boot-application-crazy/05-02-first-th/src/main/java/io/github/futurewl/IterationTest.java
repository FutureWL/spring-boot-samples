package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.ArrayList;
import java.util.List;

public class IterationTest {

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        // 创建解析器
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        // 设置到模板引擎中
        templateEngine.setTemplateResolver(resolver);
        // 设置集合数据
        List<DataObject> datas = new ArrayList<DataObject>();
        datas.add(new DataObject("a"));
        datas.add(new DataObject("b"));
        Context ctx = new Context();
        ctx.setVariable("datas", datas);
        // 处理classpath下的 index.html文件
        String result = templateEngine.process("iteration.html", ctx);
        System.out.println(result);
    }
}
