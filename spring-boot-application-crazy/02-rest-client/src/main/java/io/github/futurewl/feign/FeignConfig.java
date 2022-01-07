package io.github.futurewl.feign;

import feign.Feign;
import feign.gson.GsonDecoder;
import org.springframework.context.annotation.Bean;

public class FeignConfig {

    @Bean
    public PersonClient personClient() {
        return Feign.builder().decoder(new GsonDecoder()).target(PersonClient.class, "http://localhost:8080/");
    }
}
