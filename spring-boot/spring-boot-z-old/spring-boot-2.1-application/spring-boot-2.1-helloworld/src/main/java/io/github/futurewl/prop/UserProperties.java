package io.github.futurewl.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @author weilai create by 2018-12-09:22:32
 * @version 1.0
 */
@Component
@ConfigurationProperties(prefix = "userinfo")
public class UserProperties {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
