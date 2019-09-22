package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:23:03
 * @version 1.0
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class FinchleyWeatherApplicationMicroWeatherConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(FinchleyWeatherApplicationMicroWeatherConfigServer.class, args);
    }
}
