package io.github.futurewl.spring.cloud.finchley.weather.service;

import io.github.futurewl.spring.cloud.finchley.weather.vo.WeatherResponse;

/**
 * 功能描述：天气数据服务
 *
 * @author weilai create by 2019-06-08:21:01
 * @version 1.0
 */
public interface WeatherDataService {

    WeatherResponse getDataByCityId(String cityId);

    WeatherResponse getDataByCityName(String cityName);

    void syncDataByCityId(String cityId);
}
