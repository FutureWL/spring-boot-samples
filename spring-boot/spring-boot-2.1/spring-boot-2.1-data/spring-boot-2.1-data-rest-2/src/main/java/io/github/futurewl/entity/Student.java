package io.github.futurewl.entity;

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

    @ManyToOne
    private Course course;

}
