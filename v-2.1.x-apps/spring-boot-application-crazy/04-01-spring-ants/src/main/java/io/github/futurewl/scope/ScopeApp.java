package io.github.futurewl.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ScopeApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ScopeApp.class).run(args);
    }

    @Autowired
    ApplicationContext ctx;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("非单态的bean：" + ctx.getBean("bean1") + ", 单态的bean："
                + ctx.getBean("bean2"));
        return "hello";
    }
}
