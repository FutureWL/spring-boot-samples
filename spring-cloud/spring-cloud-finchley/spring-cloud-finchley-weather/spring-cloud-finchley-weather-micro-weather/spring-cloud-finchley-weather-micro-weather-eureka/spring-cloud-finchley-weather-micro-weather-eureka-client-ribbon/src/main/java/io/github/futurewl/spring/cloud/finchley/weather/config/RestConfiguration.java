package io.github.futurewl.spring.cloud.finchley.weather.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述：REST 配置类
 *
 * @author weilai create by 2019-06-09:15:06
 * @version 1.0
 */
@Configuration
@RibbonClient(name = "ribbon-client", configuration = RibbonConfiguration.class)
public class RestConfiguration {

    @Autowired
    private RestTemplateBuilder builder;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return builder.build();
    }

}
