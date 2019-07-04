package io.github.futurewl.spring.cloud.finchley.weather.controller;

import io.github.futurewl.spring.cloud.finchley.weather.service.CityDataService;
import io.github.futurewl.spring.cloud.finchley.weather.service.WeatherReportService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:21:11
 * @version 1.0
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {

    private final CityDataService cityDataService;
    private final WeatherReportService weatherReportService;

    public WeatherReportController(CityDataService cityDataService, WeatherReportService weatherReportService) {
        this.cityDataService = cityDataService;
        this.weatherReportService = weatherReportService;
    }

    @GetMapping("/cityId/{cityId}")
    public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, Model model) throws Exception {
        model.addAttribute("title", "天气预报");
        model.addAttribute("cityId", cityId);
        model.addAttribute("cityList", cityDataService.listCity());
        model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
        return new ModelAndView("weather/report", "reportModel", model);
    }

}
