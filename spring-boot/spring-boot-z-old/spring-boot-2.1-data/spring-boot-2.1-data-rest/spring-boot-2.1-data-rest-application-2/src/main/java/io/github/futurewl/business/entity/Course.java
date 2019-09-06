package io.github.futurewl.business.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * 功能描述：课程
 *
 * @author weilai
 */
@Getter
@Setter
@Entity
@ToString(exclude = {"students"})
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "course", cascade = CascadeType.ALL)
    private Teacher teacher;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

}
