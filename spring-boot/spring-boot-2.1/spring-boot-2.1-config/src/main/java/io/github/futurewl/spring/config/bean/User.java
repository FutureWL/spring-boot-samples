package io.github.futurewl.spring.config.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:13:51
 * @version 1.0
 */
@Data
@Configuration
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.forezp")
public class User {

    private String name;

    private int age;

}
