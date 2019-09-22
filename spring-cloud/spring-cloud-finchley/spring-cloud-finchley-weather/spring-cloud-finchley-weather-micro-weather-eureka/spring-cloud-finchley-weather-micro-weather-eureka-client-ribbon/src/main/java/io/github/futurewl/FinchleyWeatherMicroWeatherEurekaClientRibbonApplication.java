package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:14:58
 * @version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class FinchleyWeatherMicroWeatherEurekaClientRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinchleyWeatherMicroWeatherEurekaClientRibbonApplication.class, args);
    }
}
