package io.github.futurewl.inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectConfig {

    @Bean
    public InjectBean myBean1() {
        return new InjectBean("1");
    }

    @Bean
    public InjectBean myBean2() {
        return new InjectBean("2");
    }
}
