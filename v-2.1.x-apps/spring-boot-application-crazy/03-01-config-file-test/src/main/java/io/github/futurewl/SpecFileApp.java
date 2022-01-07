package io.github.futurewl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpecFileApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpecFileApp.class)
                .properties(
                        "spring.config.location=classpath:/test-folder/my-config.properties")
                .run(args);
    }

    @Autowired
    private Environment env;

    @GetMapping("/ta")
    public String getProp() {
        System.out.println(env.getProperty("user.test.name"));
        return "";
    }
}
