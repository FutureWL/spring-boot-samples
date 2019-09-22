package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:17:04
 * @version 1.0
 */
@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class BrixtonTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(BrixtonTurbineApplication.class, args);
    }
}
