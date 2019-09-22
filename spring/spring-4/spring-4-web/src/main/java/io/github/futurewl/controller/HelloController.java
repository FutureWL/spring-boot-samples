package io.github.futurewl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/Hello")
    public String HelloWorld(Model model) {
        model.addAttribute("message", "Hello World!!!");
        return "hello";
    }

}
