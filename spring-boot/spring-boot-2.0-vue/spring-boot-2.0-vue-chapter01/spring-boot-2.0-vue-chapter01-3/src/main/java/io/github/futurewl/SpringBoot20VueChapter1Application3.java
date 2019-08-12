package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoot20VueChapter1Application3 {

    @GetMapping("/hello")
    public String hello() {
        return "hello jetty";
    }

    public static void main(String[] args) {
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBoot20VueChapter1Application3.class);
//        builder.application().setAdditionalProfiles("dev");
//        builder.run(args);
        SpringApplication.run(SpringBoot20VueChapter1Application3.class, args);
    }
}
