package io.github.futurewl.service.impl;

import io.github.futurewl.service.DataClient;
import io.github.futurewl.service.WeatherReportService;
import io.github.futurewl.vo.Weather;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:08:14
 * @version 1.0
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    private final DataClient dataClient;

    public WeatherReportServiceImpl(DataClient dataClient) {
        this.dataClient = dataClient;
    }

    @Override
    public Weather getDataByCityId(String cityId) {
        return dataClient.getDataByCityId(cityId).getData();
    }

}
