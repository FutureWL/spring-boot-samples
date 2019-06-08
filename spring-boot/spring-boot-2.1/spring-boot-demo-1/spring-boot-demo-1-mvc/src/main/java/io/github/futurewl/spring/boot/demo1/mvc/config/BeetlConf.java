package io.github.futurewl.spring.boot.demo1.mvc.config;

import com.ibeetl.starter.BeetlTemplateCustomize;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:12:10
 * @version 1.0
 */
//@Configuration
public class BeetlConf {

    @Bean
    public BeetlTemplateCustomize beetlTemplateCustomize() {
        return groupTemplate -> {

        };
    }

}
