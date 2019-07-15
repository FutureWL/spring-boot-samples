package io.github.futurewl.entity;

import lombok.Data;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Data
public class User {

    private String name;

    private List<Role> roles;
}
