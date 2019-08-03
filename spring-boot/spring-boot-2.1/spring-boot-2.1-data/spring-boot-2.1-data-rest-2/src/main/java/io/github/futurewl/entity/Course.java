package io.github.futurewl.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 功能描述：课程
 *
 * @author weilai
 */
@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    private Teacher teacher;

    @OneToMany(
            mappedBy = "course",
            cascade = {
                    CascadeType.DETACH,
                    CascadeType.REFRESH
            })
    private List<Student> studentList;

}
