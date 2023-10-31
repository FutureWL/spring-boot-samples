package io.github.futurewl.sbs.v30x;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloApplicationV30x {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplicationV30x.class, args);
    }

    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello," + name;
    }


}
