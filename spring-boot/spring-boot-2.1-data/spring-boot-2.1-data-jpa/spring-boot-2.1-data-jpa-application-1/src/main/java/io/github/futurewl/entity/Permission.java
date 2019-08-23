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
@ToString(exclude = "roles")
@Table(name = "t_permission")
@org.hibernate.annotations.Table(appliesTo = "t_permission", comment = "权限表")
public class Permission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(50) comment '权限名'")
    private String name;

    @ManyToMany(mappedBy = "permissions", fetch = FetchType.EAGER)
    private Set<Role> roles;
}
