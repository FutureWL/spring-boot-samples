package io.github.futurewl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class FileApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FileApp.class).run(args);
    }

    @Autowired
    private Environment env;

    @GetMapping("/ua")
    public String getProp() {
        System.out.println(env.getProperty("user.test.name"));
        return "";
    }
}
