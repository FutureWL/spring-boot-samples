package io.github.futurewl.spring.cloud.finchley.weather.service;

import io.github.futurewl.spring.cloud.finchley.weather.vo.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 功能描述：访问城市信息的客户端
 *
 * @author weilai create by 2019-06-09:15:17
 * @version 1.0
 */
@FeignClient("msa-weather-city-eureka")
public interface CityClient {

    @GetMapping("/cities")
    List<City> listCity();

}
