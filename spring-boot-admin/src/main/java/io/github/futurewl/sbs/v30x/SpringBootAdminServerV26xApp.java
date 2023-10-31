package io.github.futurewl.sbs.v31x;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringBootAdminServerV26xApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminServerV26xApp.class, args);
    }
}
