package io.github.futurewl.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:21:18
 * @version 1.0
 */
@Configuration
public class RestConfiguration {

    private final RestTemplateBuilder builder;

    public RestConfiguration(RestTemplateBuilder builder) {
        this.builder = builder;
    }

    @Bean
    public RestTemplate restTemplate() {
        return builder.build();
    }

}
