package io.github.futurewl.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:17:54
 * @version 1.0
 */
@EnableSwagger2
@SpringBootApplication
public class SpringBoot14HelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot14HelloWorldApplication.class, args);
    }
}
