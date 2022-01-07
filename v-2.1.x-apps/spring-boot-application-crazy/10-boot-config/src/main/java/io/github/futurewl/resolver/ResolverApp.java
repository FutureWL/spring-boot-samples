package io.github.futurewl.resolver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@Controller
public class ResolverApp {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ResolverApp.class);
        // 关闭Thymeleaf视图解析
        builder.properties("spring.thymeleaf.cache=false");
        builder.run(args);
    }

    @GetMapping("/test/{name}")
    public String test(@PathVariable String name, Model model) {
        model.addAttribute("message", "Hello, " + name);
        return "myView";
    }
}
