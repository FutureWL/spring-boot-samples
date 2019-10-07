package io.github.futurewl.thrsv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@Controller
public class ThResolverApp {

    public static void main(String[] args) {
        SpringApplication.run(ThResolverApp.class, args);
    }

    @GetMapping("/test/{name}")
    public String test(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "testView";
    }

}
