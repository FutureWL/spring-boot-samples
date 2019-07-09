package io.github.futurewl;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-07-09:22:02
 * @version 1.0
 */
@Component
public class MyConsumer {
    @KafkaListener(topics = "mytopic")
    public void listen(ConsumerRecord<?, String> record) {
        String value = record.value();
        System.out.println(value);
        System.out.println(record);
    }
}
