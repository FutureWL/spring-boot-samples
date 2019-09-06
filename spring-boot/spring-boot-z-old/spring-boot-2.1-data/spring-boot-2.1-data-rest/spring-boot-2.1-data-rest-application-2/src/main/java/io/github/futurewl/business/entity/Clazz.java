package io.github.futurewl.business.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * 功能描述：班级
 *
 * @author weilai
 */
@Getter
@Setter
@Entity
@ToString(exclude = {"students"})
public class Clazz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /**
     * 一个班级对应多个学生，一个学生对应一个班级
     */
    @OneToMany(mappedBy = "clazz")
    private Set<Student> students;
}
