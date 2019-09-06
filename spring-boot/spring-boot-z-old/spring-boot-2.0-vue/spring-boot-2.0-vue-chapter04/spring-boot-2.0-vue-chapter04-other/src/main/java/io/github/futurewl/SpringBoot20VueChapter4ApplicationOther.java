package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

/**
 * https://jinaconvert.com/cn/convert-to-ico.php
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class SpringBoot20VueChapter4ApplicationOther {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot20VueChapter4ApplicationOther.class, args);
    }
}
