package io.github.futurewl.nosql.redis.entity;

import java.io.Serializable;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:12:31
 * @version 1.0
 */
public class Person implements Serializable {

    private static final long  serialVersionUID = 1L;

    private String id;
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
