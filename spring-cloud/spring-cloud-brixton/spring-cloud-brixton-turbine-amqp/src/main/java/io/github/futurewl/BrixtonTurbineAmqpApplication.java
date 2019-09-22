package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:17:10
 * @version 1.0
 */
@EnableTurbineStream
@EnableDiscoveryClient
@SpringBootApplication
public class BrixtonTurbineAmqpApplication {
    public static void main(String[] args) {
        SpringApplication.run(BrixtonTurbineAmqpApplication.class, args);
    }
}
