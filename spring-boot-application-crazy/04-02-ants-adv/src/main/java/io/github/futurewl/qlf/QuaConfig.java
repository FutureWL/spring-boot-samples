package io.github.futurewl.qlf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuaConfig {

    @Bean
    public QuaBean quaBeanA() {
        return new QuaBean("a");
    }

    @Bean
    public QuaBean quaBeanB() {
        return new QuaBean("b");
    }
}
