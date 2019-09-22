package io.github.futurewl;

import com.netflix.discovery.DiscoveryClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:14:54
 * @version 1.0
 */
@Slf4j
@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {

    private final DiscoveryClient client;

    public EurekaClientApplication(DiscoveryClient client) {
        this.client = client;
    }

//    public String index(){
//        ServiceInstance instance = client.gets
//    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
