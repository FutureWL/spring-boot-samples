package io.github.futurewl.spring.boot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：HelloWorld Spring Boot 应用启动
 *
 * @author weilai create by 2018-12-05:18:05
 * @version 1.0
 */
@RestController
@SpringBootApplication
public class HelloWorldApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    /**
     * 入口方法
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}
