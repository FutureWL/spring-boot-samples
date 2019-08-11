package io.github.futurewl.spring.boot.mq.rabbitmq.none;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-07-04:23:03
 * @version 1.0
 */
public class RabbitProducer {
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setPort(32783);
        factory.setUsername("root");
        factory.setPassword("root123");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare("exchange_demo", "direct", true, false, null);
        channel.queueDeclare("queue_demo", true, false, false, null);
        channel.queueBind("queue_demo", "exchange_demo", "routing_key");
        String message = "Hello World!";
        channel.basicPublish(
                "exchange_demo",
                "routing_key",
                MessageProperties.PERSISTENT_TEXT_PLAIN,
                message.getBytes()
        );
        channel.close();
        connection.close();
    }
}
