package io.github.futurewl;

import io.github.futurewl.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 功能描述：Bean 生命周期
 *
 * @author weilai
 */
@Slf4j
@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class SpringBoot21ApplicationBeanLifeCycle implements CommandLineRunner {

    @Autowired
    private Person person1;

    @Autowired
    private Person person2;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21ApplicationBeanLifeCycle.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(person1.toString());
        log.info(person2.toString());
    }
}
