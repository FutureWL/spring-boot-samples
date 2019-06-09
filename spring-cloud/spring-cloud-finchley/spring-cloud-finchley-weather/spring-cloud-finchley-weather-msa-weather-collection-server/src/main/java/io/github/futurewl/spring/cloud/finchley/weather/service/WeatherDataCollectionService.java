package io.github.futurewl.spring.cloud.finchley.weather.service;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:09:43
 * @version 1.0
 */
public interface WeatherDataCollectionService {

    void syncDataByCityId(String cityId);

}
