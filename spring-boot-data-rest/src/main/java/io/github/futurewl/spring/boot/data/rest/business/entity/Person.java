package io.github.futurewl.spring.boot.data.rest.business.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 功能描述：测试实体
 *
 * @author weilai create by 2019-03-17:23:50
 * @version 1.0
 */
@Data
@Entity
@Table(name = "t_person")
@EqualsAndHashCode(callSuper = true)
@org.hibernate.annotations.Table(appliesTo = "t_person", comment = "测试实体表")
public class Person extends BaseEntity {

    /**
     * 名字
     */
    @Column(nullable = false, columnDefinition = "varchar(20) comment '名字'")
    private String name;

}
