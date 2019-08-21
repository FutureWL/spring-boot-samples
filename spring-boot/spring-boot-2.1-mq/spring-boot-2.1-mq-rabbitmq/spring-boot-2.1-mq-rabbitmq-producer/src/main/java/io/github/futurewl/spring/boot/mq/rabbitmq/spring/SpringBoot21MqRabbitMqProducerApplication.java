package io.github.futurewl.spring.boot.mq.rabbitmq.spring;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 功能描述：RabbitMQ 生产者启动类
 *
 * @author weilai create by 2019-07-04:23:46
 * @version 1.0
 */
@SpringBootApplication
public class SpringBoot21MqRabbitMqProducerApplication implements CommandLineRunner {

    @Autowired
    public RabbitTemplate rabbitTemplate;

    @Bean
    public Queue queue() {
        return new Queue("my-queue");
    }

    @Bean
    public Queue queue2() {
        Queue queue = new Queue("my-queue2");
        return queue;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21MqRabbitMqProducerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        new Thread(() -> {
            for (; ; ) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                rabbitTemplate.convertAndSend(
                        "my-queue",
                        "来自RabbitMQ的问候" + new Date()
                );
            }
        }).start();

    }
}
