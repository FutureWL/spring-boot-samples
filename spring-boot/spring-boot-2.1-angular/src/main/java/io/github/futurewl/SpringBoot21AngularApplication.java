package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai
 */
@CrossOrigin
@RestController
@SpringBootApplication
public class SpringBoot21AngularApplication {

    @GetMapping("/hello")
    public String hello(String name) {
        System.out.println("Hello" + name);
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21AngularApplication.class, args);
    }
}
