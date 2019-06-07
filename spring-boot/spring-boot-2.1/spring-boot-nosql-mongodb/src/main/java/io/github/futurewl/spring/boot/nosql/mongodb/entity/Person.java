package io.github.futurewl.spring.boot.nosql.mongodb.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:11:23
 * @version 1.0
 */
@Document
public class Person {

    private String id;

    private String name;

    private Integer age;

    private Collection<Location> locations = new LinkedHashSet<>();

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String id, String name, Integer age, Collection<Location> locations) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.locations = locations;
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

    public Collection<Location> getLocations() {
        return locations;
    }

    public void setLocations(Collection<Location> locations) {
        this.locations = locations;
    }
}
