package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootApplicationCrazy0302WarTest extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootApplicationCrazy0302WarTest.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationCrazy0302WarTest.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
