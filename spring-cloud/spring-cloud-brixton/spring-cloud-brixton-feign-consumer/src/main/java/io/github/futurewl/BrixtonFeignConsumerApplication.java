package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:17:15
 * @version 1.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class BrixtonFeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BrixtonFeignConsumerApplication.class, args);
    }
}
