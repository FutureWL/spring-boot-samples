package io.github.futurewl.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimaryApp {

    public static void main(String[] args) {
        SpringApplication.run(PrimaryApp.class, args);
    }

    @Autowired
    PrimaryBean bean;

    @GetMapping("/primary")
    public String primary() {
        System.out.println(bean.getId());
        return "";
    }
}
