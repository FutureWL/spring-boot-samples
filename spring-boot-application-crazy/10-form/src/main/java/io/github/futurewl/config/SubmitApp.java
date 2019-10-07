package io.github.futurewl.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
@Controller
public class SubmitApp {

    public static void main(String[] args) {
        SpringApplication.run(SubmitApp.class, args);
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute User user) {
        System.out.println("表单对象: " + user.getUserName());
        return "submit";
    }

    @GetMapping("/test/{form}")
    public String openForm(@PathVariable String form, @ModelAttribute User user) {
        return form;
    }
}