package io.github.futurewl.ct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CustomApp {

    public static void main(String[] args) {
        SpringApplication.run(CustomApp.class, args);
    }

    @Autowired
    @AnimalQualifier(type = "person")
    private AnimalBean person;

    @GetMapping("/cus")
    public String getAnm() {
        System.out.println(person.getName());
        return "";
    }
}
