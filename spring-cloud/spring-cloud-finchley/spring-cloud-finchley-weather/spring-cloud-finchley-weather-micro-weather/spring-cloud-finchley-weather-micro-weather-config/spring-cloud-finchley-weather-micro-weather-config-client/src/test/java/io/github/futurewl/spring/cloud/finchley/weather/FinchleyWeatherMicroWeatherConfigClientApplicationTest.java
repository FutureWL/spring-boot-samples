package io.github.futurewl.spring.cloud.finchley.weather;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:23:16
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FinchleyWeatherMicroWeatherConfigClientApplicationTest {

    @Value("${auther}")
    private String auther;

    @Test
    public void contextLoads() {
        assertEquals("weilai", auther);
    }
}
