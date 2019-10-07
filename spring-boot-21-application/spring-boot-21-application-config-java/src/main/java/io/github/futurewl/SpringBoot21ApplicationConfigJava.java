package io.github.futurewl;

import io.github.futurewl.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot21ApplicationConfigJava implements CommandLineRunner {

    @Autowired
    private User user;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21ApplicationConfigJava.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(user);
    }
}
