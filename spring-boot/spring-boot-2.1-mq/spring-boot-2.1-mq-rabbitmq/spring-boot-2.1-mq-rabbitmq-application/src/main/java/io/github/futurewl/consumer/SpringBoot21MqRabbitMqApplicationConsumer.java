package io.github.futurewl.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述：
 *
 * @author weilai
 */
@SpringBootApplication
public class SpringBoot21MqRabbitMqApplicationConsumer {

    @RabbitListener(queues = "application-producer")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21MqRabbitMqApplicationConsumer.class, args);
    }
}
