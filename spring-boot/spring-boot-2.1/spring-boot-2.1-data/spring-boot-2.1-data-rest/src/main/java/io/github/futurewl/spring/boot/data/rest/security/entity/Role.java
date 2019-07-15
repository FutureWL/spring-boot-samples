package io.github.futurewl.spring.boot.data.rest.security.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Data
@Entity
@ToString(exclude = "users")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private List<User> users;


}
