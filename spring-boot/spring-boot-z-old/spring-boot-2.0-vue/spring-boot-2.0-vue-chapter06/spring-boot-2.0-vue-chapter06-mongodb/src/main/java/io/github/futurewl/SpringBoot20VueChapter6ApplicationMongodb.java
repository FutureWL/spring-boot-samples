package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan("org.sang")
//@EnableAutoConfiguration(exclude = MongoAutoConfiguration.class)
public class SpringBoot20VueChapter6ApplicationMongodb {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot20VueChapter6ApplicationMongodb.class, args);
    }
}
