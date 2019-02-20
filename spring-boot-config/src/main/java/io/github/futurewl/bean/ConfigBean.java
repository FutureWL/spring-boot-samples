package io.github.futurewl.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:13:51
 * @version 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "my")
public class ConfigBean {

    private String name;

    private int age;

    private int number;

    private String uuid;

    private int max;

    private String value;

    private String greeting;

}
