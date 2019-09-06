package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringBoot20VueChapter4ApplicationServlet {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot20VueChapter4ApplicationServlet.class, args);
    }
}
