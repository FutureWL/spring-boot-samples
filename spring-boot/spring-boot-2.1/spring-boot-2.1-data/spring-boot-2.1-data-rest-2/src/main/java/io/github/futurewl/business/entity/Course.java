package io.github.futurewl.business.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * 功能描述：课程
 *
 * @author weilai
 */
@Data
@Entity
@ToString(exclude = {"studentList"})
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Teacher teacher;

    @OneToMany(mappedBy = "course")
    private Set<Student> studentList;

}
