package io.github.futurewl.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Getter
@Setter
@Entity
@Table(name = "t_role")
@ToString(
        exclude = "users"
)
@org.hibernate.annotations.Table(appliesTo = "t_role", comment = "角色表")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(50) comment '角色名'")
    private String name;


    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    private Set<User> users;

    @ManyToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private Set<Permission> permissions;
}
