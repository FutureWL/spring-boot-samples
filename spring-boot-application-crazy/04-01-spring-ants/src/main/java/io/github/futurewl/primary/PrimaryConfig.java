package io.github.futurewl.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryConfig {

    @Bean
    @Primary
    public PrimaryBean bean1() {
        return new PrimaryBean("1");
    }

    @Bean
    public PrimaryBean bean2() {
        return new PrimaryBean("2");
    }
}
