package io.github.futurewl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@SpringBootApplication
@Controller
public class ThyApp {

    public static void main(String[] args) {
        SpringApplication.run(ThyApp.class, args);
    }

    @Autowired
    private TemplateEngine engine;

    @GetMapping("/test/{name}")
    @ResponseBody
    public String test(@PathVariable String name) {
        // 创建上下文对象
        Context ctx = new Context();
        ctx.setVariable("name", name);
        // 处理模板，模板为 templates/test1.html
        String result = engine.process("test1", ctx);
        return result;
    }
}