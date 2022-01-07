package io.github.futurewl.sbs.v26x.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

@Configuration(proxyBeanMethods = false)
public class MyHttpMessageConvertersConfiguration {

//    @Bean
//    public HttpMessageConverters customConverters() {
//        HttpMessageConverter<?> additional = new AdditionalHttpMessageConverter();
//        HttpMessageConverter<?> another = new AnotherHttpMessageConverter();
//        return new HttpMessageConverters(additional, another);
//    }

}
