package io.github.futurewl.spring.cloud.finchley.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:23:12
 * @version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class FinchleyWeatherMicroWeatherConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinchleyWeatherMicroWeatherConfigClientApplication.class, args);
    }
}
