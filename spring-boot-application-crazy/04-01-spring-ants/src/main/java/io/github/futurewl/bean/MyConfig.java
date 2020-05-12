package io.github.futurewl.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public MyBean getMyBean() {
        return new MyBean();
    }

    @Bean("bean2")
    public MyBean myBean2() {
        return new MyBean();
    }
}
