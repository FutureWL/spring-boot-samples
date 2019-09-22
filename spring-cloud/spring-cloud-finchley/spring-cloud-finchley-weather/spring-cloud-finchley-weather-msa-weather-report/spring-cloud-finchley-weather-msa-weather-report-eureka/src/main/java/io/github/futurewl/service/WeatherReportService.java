package io.github.futurewl.service;

import io.github.futurewl.vo.Weather;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:08:14
 * @version 1.0
 */
public interface WeatherReportService {

    Weather getDataByCityId(String cityId);

}
