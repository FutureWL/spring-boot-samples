package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:23:43
 * @version 1.0
 */
@EnableFeignClients
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class FinchleyWeatherApplicationMicroWeatherEurekaClientFeignHystrix {
    public static void main(String[] args) {
        SpringApplication.run(FinchleyWeatherApplicationMicroWeatherEurekaClientFeignHystrix.class, args);
    }
}
