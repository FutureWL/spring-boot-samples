package io.github.futurewl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-07-09:21:55
 * @version 1.0
 */
@RestController
@SpringBootApplication
public class SpringBoot21KafkaProducerApplication {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("/send")
    public String send(String name) {
        kafkaTemplate.send("mytopic", name);
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21KafkaProducerApplication.class, args);
    }
}
