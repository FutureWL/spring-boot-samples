package io.github.futurewl.spring.cloud.finchley.weather.service.impl;

import io.github.futurewl.spring.cloud.finchley.weather.service.WeatherDataCollectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * 功能描述：天气数据采集服务
 *
 * @author weilai create by 2019-06-09:09:44
 * @version 1.0
 */
@Service
public class WeatherDataCollectionServiceImpl implements WeatherDataCollectionService {

    private final static Logger logger = LoggerFactory.getLogger(WeatherDataCollectionServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";
    private final Long TIME_OUT = 1800L;


    @Override
    public void syncDataByCityId(String cityId) {
        logger.info("Start 同步天气.cityId:" + cityId);
        String uri = WEATHER_API + "?citykey=" + cityId;
        this.saveWeatherData(uri);
        logger.info("End 同步天气.cityId:" + cityId);
    }

    private void saveWeatherData(String uri) {
        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
        String key = uri;
        String strBody = null;
        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
        if (response.getStatusCodeValue() == 200) {
            strBody = response.getBody();
        }
        ops.set(key, strBody, TIME_OUT, TimeUnit.SECONDS);
    }

}
