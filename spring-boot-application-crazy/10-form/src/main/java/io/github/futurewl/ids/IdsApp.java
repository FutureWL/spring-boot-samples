package io.github.futurewl.ids;

import io.github.futurewl.FormObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class IdsApp {

    public static void main(String[] args) {
        SpringApplication.run(IdsApp.class, args);
    }

    @GetMapping("/ids")
    public String field(Model model) {
        FormObject formObject = new FormObject();
        formObject.setName("crazyit");
        model.addAttribute("formObject", formObject);
        return "ids";
    }
}