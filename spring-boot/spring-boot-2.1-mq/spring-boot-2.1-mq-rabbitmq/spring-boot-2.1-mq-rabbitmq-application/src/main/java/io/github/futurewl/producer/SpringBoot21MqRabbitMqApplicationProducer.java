package io.github.futurewl.producer;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 功能描述：
 *
 * @author weilai
 */
@SpringBootApplication
public class SpringBoot21MqRabbitMqApplicationProducer implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;

    public SpringBoot21MqRabbitMqApplicationProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Bean
    public Queue queue() {
        Map<String, Object> queueArgs = new HashMap<>();
        queueArgs.put("x-message-ttl", 10000);
        return new Queue(
                "spring-boot-21-mq-rabbitmq-application-producer",
                false,
                false,
                true,
                queueArgs);

//        return new Queue("spring-boot-21-mq-rabbitmq-application-producer");
//        return new Queue("application-producer");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21MqRabbitMqApplicationProducer.class, args);
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
                        "spring-boot-21-mq-rabbitmq-application-producer",
                        "来自RabbitMQ的问候" + new Date()
                );
            }
        }).start();
    }
}
