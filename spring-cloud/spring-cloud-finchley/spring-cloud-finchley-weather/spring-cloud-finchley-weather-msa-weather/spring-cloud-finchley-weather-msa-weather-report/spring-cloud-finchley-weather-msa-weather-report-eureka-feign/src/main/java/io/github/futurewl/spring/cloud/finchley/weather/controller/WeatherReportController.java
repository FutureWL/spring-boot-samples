package io.github.futurewl.spring.cloud.finchley.weather.controller;

import io.github.futurewl.spring.cloud.finchley.weather.service.CityClient;
import io.github.futurewl.spring.cloud.finchley.weather.service.WeatherReportService;
import io.github.futurewl.spring.cloud.finchley.weather.vo.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:21:11
 * @version 1.0
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {

    private final static Logger logger = LoggerFactory.getLogger(WeatherReportController.class);

    private final WeatherReportService weatherReportService;
    private final CityClient cityClient;

    public WeatherReportController(WeatherReportService weatherReportService, CityClient cityClient) {
        this.weatherReportService = weatherReportService;
        this.cityClient = cityClient;
    }

    @GetMapping("/cityId/{cityId}")
    public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, Model model) throws Exception {
        List<City> cityList = null;
        try {
            cityList = cityClient.listCity();
        } catch (Exception e) {
            logger.error("获取城市信息异常！", e);
            throw new RuntimeException("获取城市信息异常！", e);
        }
        model.addAttribute("title", "天气预报");
        model.addAttribute("cityId", cityId);
        model.addAttribute("cityList", cityList);
        model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
        return new ModelAndView("weather/report", "reportModel", model);
    }

}
