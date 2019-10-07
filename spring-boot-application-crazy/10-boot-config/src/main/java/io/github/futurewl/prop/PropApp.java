package io.github.futurewl.prop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class PropApp {

    public static void main(String[] args) {
        SpringApplication.run(PropApp.class, args);
    }

    @Autowired
    private ApplicationContext ctx;

    @GetMapping("/test")
    public String test() {
        return "prop";
    }
}
