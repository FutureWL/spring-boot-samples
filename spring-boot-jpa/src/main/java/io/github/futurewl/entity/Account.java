package io.github.futurewl.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:14:27
 * @version 1.0
 */
@Data
@Entity
public class Account {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private double money;
}
