package io.github.futurewl.spring.cloud.finchley.weather.job;

import io.github.futurewl.spring.cloud.finchley.weather.service.CityClient;
import io.github.futurewl.spring.cloud.finchley.weather.service.WeatherDataCollectionService;
import io.github.futurewl.spring.cloud.finchley.weather.vo.City;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 功能描述：天气数据同步任务
 *
 * @author weilai create by 2019-06-08:21:42
 * @version 1.0
 */
@Component
public class WeatherDataSyncJob extends QuartzJobBean {

    private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);

    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;

    @Autowired
    private CityClient cityClient;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("Start 天气数据同步任务");

        // todo 改为由城市数据 API 微服务来提供数据

        List<City> cityList = null;
        try {
//            cityList = new ArrayList<>();
//            City city = new City();
//            city.setCityId("101280601");
//            cityList.add(city);
            cityList = cityClient.listCity();
        } catch (Exception e) {
            logger.error("获取城市信息异常！", e);
            throw new RuntimeException("获取城市信息异常！", e);
        }
        for (City city : cityList) {
            String cityId = city.getCityId();
            logger.info("天气数据同步中,cityId:" + cityId);
            weatherDataCollectionService.syncDataByCityId(cityId);
        }
        logger.info("End 天气数据同步任务");
    }
}
