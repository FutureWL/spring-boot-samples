package io.github.futurewl.mc;

import io.github.futurewl.oc.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnMyTerm
@Configuration
public class MyConfig {

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
