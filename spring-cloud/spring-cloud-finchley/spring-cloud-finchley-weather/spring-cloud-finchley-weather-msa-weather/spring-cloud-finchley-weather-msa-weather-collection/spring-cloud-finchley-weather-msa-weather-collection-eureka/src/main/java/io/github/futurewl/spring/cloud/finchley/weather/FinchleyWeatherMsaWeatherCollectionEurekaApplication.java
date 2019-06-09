package io.github.futurewl.spring.cloud.finchley.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:13:47
 * @version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class FinchleyWeatherMsaWeatherCollectionEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinchleyWeatherMsaWeatherCollectionEurekaApplication.class, args);
    }
}
