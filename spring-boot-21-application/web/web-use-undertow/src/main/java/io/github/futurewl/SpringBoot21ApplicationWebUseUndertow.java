package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBoot21ApplicationWebUseUndertow {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21ApplicationWebUseUndertow.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
