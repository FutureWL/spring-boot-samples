package io.github.futurewl.spring.cloud.finchley.weather.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.futurewl.spring.cloud.finchley.weather.service.WeatherDataService;
import io.github.futurewl.spring.cloud.finchley.weather.vo.WeatherResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:21:04
 * @version 1.0
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    private final RestTemplate restTemplate;
    private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";

    public WeatherDataServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String uri = WEATHER_API + "?citykey=" + cityId;
        return this.doGetWeatherData(uri);
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String uri = WEATHER_API + "?city=" + cityName;
        return this.doGetWeatherData(uri);
    }


    private WeatherResponse doGetWeatherData(String uri) {
        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
        String strBody = null;
        if (response.getStatusCodeValue() == 200) {
            strBody = response.getBody();
        }
        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse weather = null;
        try {
            weather = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weather;
    }

}
