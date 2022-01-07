package io.github.futurewl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public BigDecimalFormatterB bigDecimalFormatteBr() {
        return new BigDecimalFormatterB();
    }

    @Bean
    public BigDecimalFormatter bigDecimalFormatter() {
        return new BigDecimalFormatter();
    }

    @Bean
    public DateFormatter dateFormatter() {
        return new DateFormatter();
    }
}
