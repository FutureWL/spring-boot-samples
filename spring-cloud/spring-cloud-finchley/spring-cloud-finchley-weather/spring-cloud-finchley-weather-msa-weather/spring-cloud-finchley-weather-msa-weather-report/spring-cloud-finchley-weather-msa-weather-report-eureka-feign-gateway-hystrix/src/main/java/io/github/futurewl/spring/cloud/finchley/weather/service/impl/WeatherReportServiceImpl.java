package io.github.futurewl.spring.cloud.finchley.weather.service.impl;

import io.github.futurewl.spring.cloud.finchley.weather.service.DataClient;
import io.github.futurewl.spring.cloud.finchley.weather.service.WeatherReportService;
import io.github.futurewl.spring.cloud.finchley.weather.vo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:08:14
 * @version 1.0
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Autowired
    private DataClient dataClient;

    @Override
    public Weather getDataByCityId(String cityId) {
        return dataClient.getDataByCityId(cityId).getData();
    }

}