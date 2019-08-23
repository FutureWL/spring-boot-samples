package io.github.futurewl.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Data
@ToString(exclude = "users")
@Entity
@Table(name = "t_role")
@org.hibernate.annotations.Table(appliesTo = "t_role", comment = "角色表")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(50) comment '角色名'")
    private String name;


    @OneToMany(mappedBy = "role")
    private Set<User> users;

//    @OneToOne(mappedBy = "role")
//    private User user;
}
