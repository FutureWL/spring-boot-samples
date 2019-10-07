package io.github.futurewl.rm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/oa")
public class RmApp {

    public static void main(String[] args) {
        SpringApplication.run(RmApp.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(path = "/phello", params = "action=save")
    public String pHello() {
        return "params hello";
    }

    @GetMapping("/ghello")
    public String gHello() {
        return "get hello";
    }
}
