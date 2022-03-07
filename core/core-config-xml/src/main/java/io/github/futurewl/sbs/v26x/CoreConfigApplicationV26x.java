package io.github.futurewl.sbs.v26x;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:application-context.xml"})
public class CoreConfigApplicationV26x implements CommandLineRunner {


    @Autowired
    private User user;

    public static void main(String[] args) {
        SpringApplication.run(CoreConfigApplicationV26x.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(user);
    }
}
