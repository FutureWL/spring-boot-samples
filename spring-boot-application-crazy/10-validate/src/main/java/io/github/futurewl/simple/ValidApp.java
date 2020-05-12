package io.github.futurewl.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@SpringBootApplication
@Controller
public class ValidApp {

    public static void main(String[] args) {
        SpringApplication.run(ValidApp.class, args);
    }

    @PostMapping("/save")
    public String save(@Valid User user, BindingResult result) {
        // 控制台输入错误信息
        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode() + "---" + error.getDefaultMessage());
            }
        }
        return "validate";
    }

    @GetMapping("/open")
    public String openAdd(@ModelAttribute User user) {
        return "validate";
    }
}
