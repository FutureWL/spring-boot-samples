package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@Controller
public class DialectApp {

    public static void main(String[] args) {
        SpringApplication.run(DialectApp.class, args);
    }

    @GetMapping("/index/{sex}")
    public String index(@PathVariable String sex, Model model) {
        model.addAttribute("sex", sex);
        return "index";
    }
}
