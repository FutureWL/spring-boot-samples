package io.github.futurewl.spring.boot.mq.rabbitmq.spring;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述：RabbitMQ 消费者启动类
 *
 * @author weilai create by 2019-07-04:23:47
 * @version 1.0
 */
@SpringBootApplication
public class SpringBoot21MqRabbitMqConsumerApplication {

    @RabbitListener(queues = "rgb-rims-iot-queue")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21MqRabbitMqConsumerApplication.class, args);
    }
}
