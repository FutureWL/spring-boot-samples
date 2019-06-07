package io.github.futurewl.spring.config.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:19:20
 * @version 1.0
 */
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
