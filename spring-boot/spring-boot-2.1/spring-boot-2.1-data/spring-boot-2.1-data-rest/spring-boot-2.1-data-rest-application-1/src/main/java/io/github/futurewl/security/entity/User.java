package io.github.futurewl.security.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private List<Role> roles;
}
