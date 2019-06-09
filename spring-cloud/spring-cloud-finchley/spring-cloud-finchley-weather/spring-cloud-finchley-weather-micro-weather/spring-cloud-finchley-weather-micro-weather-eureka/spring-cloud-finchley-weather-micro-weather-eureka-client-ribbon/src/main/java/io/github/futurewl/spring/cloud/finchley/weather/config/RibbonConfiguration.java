package io.github.futurewl.spring.cloud.finchley.weather.config;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.cloud.netflix.ribbon.ZonePreferenceServerListFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:15:07
 * @version 1.0
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public ZonePreferenceServerListFilter serverListFilter() {
        ZonePreferenceServerListFilter filter = new ZonePreferenceServerListFilter();
        filter.setZone("myZone");
        return filter;
    }

    @Bean
    public IPing ribbonPing() {
        return new PingUrl();
    }
}
