package io.github.futurewl.service.impl;

import io.github.futurewl.service.WeatherReportService;
import io.github.futurewl.vo.Forecast;
import io.github.futurewl.vo.Weather;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:08:14
 * @version 1.0
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Override
    public Weather getDataByCityId(String cityId) {
        // todo 改为由天气数据API微服务来提供数据
        Weather data = new Weather();
        data.setAqi("81");
        data.setCity("深圳");
        data.setGanmao("各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。");
        data.setWendu("29");
        List<Forecast> forecastList = new ArrayList<>();

        Forecast forecast = new Forecast();
        forecast.setDate("8日星期六");
        forecast.setHigh("高温 32℃");
        forecast.setFengxiang("无持续风向");
        forecast.setLow("低温 27℃");
        forecast.setFengli("<![CDATA[<3级]]>");
        forecast.setType("多云");
        forecastList.add(forecast);
        forecastList.add(forecast);
        forecastList.add(forecast);
        forecastList.add(forecast);

        data.setForecast(forecastList);
        return data;
    }

}
