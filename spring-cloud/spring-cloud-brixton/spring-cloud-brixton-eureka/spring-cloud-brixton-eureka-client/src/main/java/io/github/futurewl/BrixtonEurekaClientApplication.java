package io.github.futurewl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:16:07
 * @version 1.0
 */
@Slf4j
@RestController
@EnableEurekaClient
@SpringBootApplication
public class BrixtonEurekaClientApplication {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() throws InterruptedException {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();

        int sleepTime = new Random().nextInt(3000);
        log.info("sleepTime:" + sleepTime);
        Thread.sleep(sleepTime);

        log.info("/hello, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(BrixtonEurekaClientApplication.class, args);
    }

}
