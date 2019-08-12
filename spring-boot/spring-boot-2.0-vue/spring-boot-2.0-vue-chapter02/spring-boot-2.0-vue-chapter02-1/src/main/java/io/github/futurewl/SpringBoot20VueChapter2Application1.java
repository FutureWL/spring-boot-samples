package io.github.futurewl;

import io.github.futurewl.bean.User;
import io.github.futurewl.bean.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot20VueChapter2Application1 implements CommandLineRunner {

    @Autowired
    private Users users;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot20VueChapter2Application1.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (User user : users.getUsers()) {
            System.out.println(user);
        }
    }
}
