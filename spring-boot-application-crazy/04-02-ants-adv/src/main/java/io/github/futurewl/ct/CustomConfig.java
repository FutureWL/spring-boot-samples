package io.github.futurewl.ct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

    @Bean
    @AnimalQualifier(type = "person")
    public AnimalBean personBean() {
        return new AnimalBean("angus"); // 动物类型为person，名称为 angus
    }

    @Bean
    @AnimalQualifier(type = "cat")
    public AnimalBean catBean() {
        return new AnimalBean("tom"); // 动物类型为cat，名称为 tom
    }
}
