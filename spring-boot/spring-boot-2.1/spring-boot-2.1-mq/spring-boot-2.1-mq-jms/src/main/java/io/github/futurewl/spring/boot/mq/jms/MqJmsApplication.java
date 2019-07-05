package io.github.futurewl.spring.boot.mq.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:14:11
 * @version 1.0
 */
@SpringBootApplication
public class MqJmsApplication implements CommandLineRunner {

    private final JmsTemplate jmsTemplate;

    @Autowired
    public MqJmsApplication(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(MqJmsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        jmsTemplate.send("my-destination", new Msg());
    }
}
