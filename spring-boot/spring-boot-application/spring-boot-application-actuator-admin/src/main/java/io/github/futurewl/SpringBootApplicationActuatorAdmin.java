package io.github.futurewl;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringBootApplicationActuatorAdmin {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationActuatorAdmin.class, args);
    }
}
