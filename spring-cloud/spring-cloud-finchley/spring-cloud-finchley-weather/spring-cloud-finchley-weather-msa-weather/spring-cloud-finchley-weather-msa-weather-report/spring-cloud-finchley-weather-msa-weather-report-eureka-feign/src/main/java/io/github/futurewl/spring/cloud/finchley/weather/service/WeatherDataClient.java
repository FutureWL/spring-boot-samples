package io.github.futurewl.spring.cloud.finchley.weather.service;

import io.github.futurewl.spring.cloud.finchley.weather.vo.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 功能描述：访问城市信息的客户端
 *
 * @author weilai create by 2019-06-09:15:17
 * @version 1.0
 */
@FeignClient("msa-weather-data-eureka")
public interface WeatherDataClient {

    @GetMapping("/weather/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);

}
