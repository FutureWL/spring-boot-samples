package io.github.futurewl.oc;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass(name = "com.mysql.jdbc.Driver")
@Configuration
public class OnClassConfig {

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
