package io.github.futurewl.spring.boot.data.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-03-17:23:50
 * @version 1.0
 */
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private Integer age;

    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
