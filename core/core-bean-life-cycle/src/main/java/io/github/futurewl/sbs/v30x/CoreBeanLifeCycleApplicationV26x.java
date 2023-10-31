package io.github.futurewl.sbs.v31x;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@Slf4j
@SpringBootApplication
@ImportResource(value = {"classpath:application-context.xml"})
public class CoreBeanLifeCycleApplicationV26x implements CommandLineRunner {

    @Autowired
    private Person person1;

    @Autowired
    private Person person2;

    public static void main(String[] args) {
        SpringApplication.run(CoreBeanLifeCycleApplicationV26x.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(person1.toString());
        log.info(person2.toString());
    }
}
