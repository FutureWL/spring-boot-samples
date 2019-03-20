package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-03-20:14:06
 * @version 1.0
 */
@RestController
@RequestMapping("/api/parks")
@SpringBootApplication
public class Application implements WebMvcConfigurer {

    class User {
        public String usernmae = "admin";
        public String password = "admin";
    }

    @GetMapping
    public User hello() {
        return new User();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
