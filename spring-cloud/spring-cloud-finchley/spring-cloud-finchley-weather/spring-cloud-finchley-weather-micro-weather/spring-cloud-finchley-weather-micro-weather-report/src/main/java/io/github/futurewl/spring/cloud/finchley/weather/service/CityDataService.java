package io.github.futurewl.spring.cloud.finchley.weather.service;

import io.github.futurewl.spring.cloud.finchley.weather.vo.City;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:21:57
 * @version 1.0
 */
public interface CityDataService {

    List<City> listCity() throws Exception;

}
