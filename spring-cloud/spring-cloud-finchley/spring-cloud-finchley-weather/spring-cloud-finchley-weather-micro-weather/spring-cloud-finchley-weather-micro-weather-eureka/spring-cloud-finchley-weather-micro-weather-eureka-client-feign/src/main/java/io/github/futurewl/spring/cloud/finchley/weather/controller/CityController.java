package io.github.futurewl.spring.cloud.finchley.weather.controller;

import io.github.futurewl.spring.cloud.finchley.weather.service.CityClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:15:18
 * @version 1.0
 */
@RestController
public class CityController {

    private final CityClient cityClient;

    public CityController(CityClient cityClient) {
        this.cityClient = cityClient;
    }

    @GetMapping("/cities")
    public String listCity() {
        return cityClient.listCity();
    }

}
