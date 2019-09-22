package io.github.futurewl.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.futurewl.service.WeatherDataService;
import io.github.futurewl.vo.WeatherResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:21:04
 * @version 1.0
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    private final static Logger logger = LoggerFactory.getLogger(WeatherDataServiceImpl.class);

    private final StringRedisTemplate stringRedisTemplate;
    private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";

    public WeatherDataServiceImpl(
            StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
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
        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
        String key = uri;
        String strBody = null;
        if (!this.stringRedisTemplate.hasKey(key)) {
            logger.info("未找到Key " + key);
            throw new RuntimeException("没有相应的天气信息");
        } else {
            logger.info("找到 key " + key + ", value=" + ops.get(key));
            strBody = ops.get(key);
        }
        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse weather = null;
        try {
            weather = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            logger.error("JSON 反序列化异常！", e);
            throw new RuntimeException("天气信息解析失败");
        }
        return weather;
    }
}
