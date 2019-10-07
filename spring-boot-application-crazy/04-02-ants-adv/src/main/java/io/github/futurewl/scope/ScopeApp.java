package io.github.futurewl.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ScopeApp {

    public static void main(String[] args) {
        SpringApplication.run(ScopeApp.class, args);
    }

    @Autowired
    ApplicationContext ctx;

    @GetMapping("/scope")
    public String scope() {
        for (int i = 0; i < 6; i++) {
            System.out.println(ctx.getBean("beanA"));
        }
        return "";
    }
}
