package io.github.futurewl.spring.cloud.microservice.simple.consumer.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述：Spring Cloud 微服务 简单服务消费者 用户对象
 *
 * @author weilai create by 2019-05-30:17:05
 * @version 1.0
 */
@SpringBootApplication
public class SpringCloudMicroserviceSimpleConsumerUserApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMicroserviceSimpleConsumerUserApplication.class, args);
    }
}
