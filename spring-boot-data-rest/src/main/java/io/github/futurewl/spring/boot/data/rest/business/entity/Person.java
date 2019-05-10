package io.github.futurewl.spring.boot.data.rest.business.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * 功能描述：测试实体
 *
 * @author weilai create by 2019-03-17:23:50
 * @version 1.0
 */
@Data
@Entity
@Table(name = "t_person")
@org.hibernate.annotations.Table(appliesTo = "t_person", comment = "测试实体表")
public class Person {

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, columnDefinition = "bigint(20) comment 'ID'")
    private Long id;

    /**
     * 名字
     */
    @Column(nullable = false, columnDefinition = "varchar(20) comment '名字'")
    private String name;

    /**
     * 创建时间
     */
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(updatable = false,
            columnDefinition = "timestamp default current_timestamp comment '创建时间'")
    private Date createTime;

    /**
     * 更新时间
     */
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(updatable = false,
            columnDefinition = "timestamp default current_timestamp on update current_timestamp comment '更新时间'")
    private Date updateTime;

}
