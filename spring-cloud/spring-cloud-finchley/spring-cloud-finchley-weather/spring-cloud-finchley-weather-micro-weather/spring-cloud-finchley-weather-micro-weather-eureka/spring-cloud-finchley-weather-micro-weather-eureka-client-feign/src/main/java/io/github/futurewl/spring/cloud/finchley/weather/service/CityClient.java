package io.github.futurewl.spring.cloud.finchley.weather.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:15:17
 * @version 1.0
 */
@FeignClient("msa-weather-city-eureka")
public interface CityClient {

    @GetMapping("/cities")
    String listCity();

}
