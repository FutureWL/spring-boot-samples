package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * 功能描述：
 *
 * @author weilai
 */
@CrossOrigin
@RestController
@SpringBootApplication
public class SpringBoot21AngularApplication {

    class Person implements Serializable {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @GetMapping("/hello")
    public Person hello(String name) {
        System.out.println("Hello" + name);
        Person person = new Person();
        person.setName(name);
        return person;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21AngularApplication.class, args);
    }
}
