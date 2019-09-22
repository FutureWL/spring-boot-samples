package io.github.futurewl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:16:32
 * @version 1.0
 */
@Slf4j
@RestController
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class BrixtonRibbonConsumerApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
//        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
        return helloService();
    }

    @HystrixCommand(fallbackMethod = "helloFallback", commandKey = "helloKey")
    public String helloService() {
        long start = System.currentTimeMillis();

        String result = restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();

        long end = System.currentTimeMillis();
        log.info("Spend time :" + (end - start));

        return result;

    }

    public String helloFallback() {
        return "error";
    }

    public static void main(String[] args) {
        SpringApplication.run(BrixtonRibbonConsumerApplication.class, args);
    }

}
