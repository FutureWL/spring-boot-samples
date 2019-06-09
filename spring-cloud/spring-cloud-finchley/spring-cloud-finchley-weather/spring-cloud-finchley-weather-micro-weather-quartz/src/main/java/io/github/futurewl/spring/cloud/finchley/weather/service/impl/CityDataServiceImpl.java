package io.github.futurewl.spring.cloud.finchley.weather.service.impl;

import io.github.futurewl.spring.cloud.finchley.weather.service.CityDataService;
import io.github.futurewl.spring.cloud.finchley.weather.util.XmlBuilder;
import io.github.futurewl.spring.cloud.finchley.weather.vo.City;
import io.github.futurewl.spring.cloud.finchley.weather.vo.CityList;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:21:57
 * @version 1.0
 */
@Service
public class CityDataServiceImpl implements CityDataService {

    @Override
    public List<City> listCity() throws Exception {
        Resource resource = new ClassPathResource("citylist.xml");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8));
        StringBuilder stringBuffer = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuffer.append(line);
        }
        bufferedReader.close();
        CityList cityList = (CityList) XmlBuilder.xmlStrToObject(CityList.class, stringBuffer.toString());
        return cityList.getCityList();
    }

}
