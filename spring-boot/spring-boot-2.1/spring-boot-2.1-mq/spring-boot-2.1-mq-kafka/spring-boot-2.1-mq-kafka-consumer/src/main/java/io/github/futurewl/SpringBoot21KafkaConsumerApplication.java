package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-07-09:21:55
 * @version 1.0
 */
@RestController
@SpringBootApplication
public class SpringBoot21KafkaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21KafkaConsumerApplication.class, args);
    }
}
