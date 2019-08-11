package org.sang.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession()
public class SpringBoot20VueChapter06SessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot20VueChapter06SessionApplication.class, args);
    }
}
