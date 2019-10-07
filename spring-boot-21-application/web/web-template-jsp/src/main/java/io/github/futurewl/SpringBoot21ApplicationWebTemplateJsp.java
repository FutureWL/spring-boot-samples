package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class SpringBoot21ApplicationWebTemplateJsp extends SpringBootServletInitializer {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBoot21ApplicationWebTemplateJsp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21ApplicationWebTemplateJsp.class, args);
    }
}
