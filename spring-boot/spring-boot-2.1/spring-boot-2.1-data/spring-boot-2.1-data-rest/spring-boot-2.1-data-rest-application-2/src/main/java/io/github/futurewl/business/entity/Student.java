package io.github.futurewl.business.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Course course;

}
