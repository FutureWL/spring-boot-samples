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
@ToString
@Entity
@Table(name = "t_user")
@org.hibernate.annotations.Table(appliesTo = "t_user", comment = "用户表")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint(20) comment 'ID'")
    private Long id;

    @Column(columnDefinition = "varchar(50) comment '用户名'")
    private String username;

    @Column(columnDefinition = "varchar(50) comment '邮箱'")
    private String email;

    @ManyToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private Set<Role> roles;
}
