package io.github.futurewl;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：SpringbootFirstApplication
 *
 * @author weilai create by 2019-02-20:13:45
 * @version 1.0
 */
@RestController
@SpringBootApplication
public class SpringbootFirstApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootFirstApplication.class, args);
    }


    @Data
    @AllArgsConstructor
    class Person {
        private String name;
        private String aaa;
    }

    @GetMapping("/hello")
    public Person hello() {
        return new Person("123", "456");
    }

}
