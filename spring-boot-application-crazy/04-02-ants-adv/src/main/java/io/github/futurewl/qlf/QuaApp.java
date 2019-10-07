package io.github.futurewl.qlf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class QuaApp {

    public static void main(String[] args) {
        SpringApplication.run(QuaApp.class, args);
    }

    @Autowired
    @Qualifier("quaBeanA")
    QuaBean bean;

    @GetMapping("/qua")
    public String testGetBean() {
        System.out.println(bean.getName());
        return "";
    }
}
