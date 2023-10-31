package io.github.futurewl.sbs.v30x;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：Webflux 应用
 */
@RestController
@SpringBootApplication
public class WebfluxV26xApp {


    @GetMapping
    public String hello() {
        return "hello webflux";
    }

    public static void main(String[] args) {
        SpringApplication.run(WebfluxV26xApp.class, args);
    }
}
