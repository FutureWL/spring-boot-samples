package io.github.futurewl;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringBoot25Apps02SpringBootAdmin {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot25Apps02SpringBootAdmin.class, args);
    }
}
