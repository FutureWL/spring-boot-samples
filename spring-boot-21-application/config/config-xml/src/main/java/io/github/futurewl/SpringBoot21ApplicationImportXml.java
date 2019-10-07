package io.github.futurewl;

import io.github.futurewl.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class SpringBoot21ApplicationImportXml implements CommandLineRunner {

    @Autowired
    private User user;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21ApplicationImportXml.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(user);
    }
}
