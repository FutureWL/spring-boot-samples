package io.github.futurewl.business.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Getter
@Setter
@Entity
@ToString(exclude = "courses")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Clazz clazz;

    @ManyToMany
    private Set<Course> courses;

}
