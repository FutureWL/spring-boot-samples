package io.github.futurewl.spring.cloud.finchley.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:15:10
 * @version 1.0
 */
@RestController
public class CityController {

    private final RestTemplate restTemplate;

    public CityController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/cities")
    public String listCity() {
        return restTemplate.getForEntity("http://msa-weather-city-eureka/cities", String.class).getBody();
    }

}
