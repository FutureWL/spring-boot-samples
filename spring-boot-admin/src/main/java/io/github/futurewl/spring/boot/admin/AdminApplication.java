package io.github.futurewl.spring.boot.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：Spring Boot Admin 启动类
 *
 * @author weilai create by 2019-05-24:17:12
 * @version 1.0
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
