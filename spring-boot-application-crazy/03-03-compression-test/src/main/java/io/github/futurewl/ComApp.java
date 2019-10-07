package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class ComApp {

    public static void main(String[] args) {
        SpringApplication.run(ComApp.class, args);
    }

    @RequestMapping(path = "/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }
}
