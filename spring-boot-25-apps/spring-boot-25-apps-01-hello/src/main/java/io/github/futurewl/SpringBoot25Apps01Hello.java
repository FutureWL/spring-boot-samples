package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBoot25Apps01Hello {

    @RequestMapping("/")
    String home() {
        return "Hello,World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot25Apps01Hello.class, args);
    }
}
