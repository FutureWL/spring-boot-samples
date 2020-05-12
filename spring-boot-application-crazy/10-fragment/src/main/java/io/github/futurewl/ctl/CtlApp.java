package io.github.futurewl.ctl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@Controller
public class CtlApp {

    public static void main(String[] args) {
        SpringApplication.run(CtlApp.class, args);
    }

    @GetMapping("/common/simple")
    public String simple() {
        return "common :: simpleBody";
    }

    @GetMapping("/argbody/{name}")
    public String argbody(@PathVariable String name) {
        return "common :: argbody (name = '" + name + "')";
    }
}
