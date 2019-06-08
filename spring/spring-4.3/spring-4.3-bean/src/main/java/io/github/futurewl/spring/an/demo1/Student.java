package io.github.futurewl.spring.an.demo1;

import org.springframework.beans.factory.annotation.Required;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:17:35
 * @version 1.0
 */
public class Student {
    private Integer age;
    private String name;

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
