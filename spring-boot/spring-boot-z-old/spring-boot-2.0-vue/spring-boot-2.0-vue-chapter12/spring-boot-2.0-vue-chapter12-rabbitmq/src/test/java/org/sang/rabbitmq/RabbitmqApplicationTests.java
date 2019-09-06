package org.sang.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    public void headerTest() {
        Message nameMsg = MessageBuilder
                .withBody("hello header! name-queue".getBytes())
                .setHeader("name", "sang").build();
        Message ageMsg = MessageBuilder
                .withBody("hello header! age-queue".getBytes())
                .setHeader("age", "99").build();
        rabbitTemplate.send(RabbitHeaderConfig.HEADERNAME, null, ageMsg);
        rabbitTemplate.send(RabbitHeaderConfig.HEADERNAME, null, nameMsg);
    }
}
