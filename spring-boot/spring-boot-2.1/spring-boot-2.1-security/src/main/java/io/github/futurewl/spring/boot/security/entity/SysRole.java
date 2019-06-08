package io.github.futurewl.spring.boot.security.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:15:09
 * @version 1.0
 */
@Entity
public class SysRole {

    @Id
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
