package io.github.futurewl.service;

import io.github.futurewl.vo.City;
import io.github.futurewl.vo.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:18:56
 * @version 1.0
 */
@FeignClient(value = "msa-weather-eureka-client-zuul",fallback = DataClientFallback.class)
public interface DataClient {

    @GetMapping("/city/cities")
    List<City> listCity() throws Exception;

    @GetMapping("/data/weather/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);

}
