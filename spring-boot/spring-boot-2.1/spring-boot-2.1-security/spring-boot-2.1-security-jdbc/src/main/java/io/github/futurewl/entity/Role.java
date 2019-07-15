package io.github.futurewl.entity;

import lombok.Data;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Data
public class Role {

    private String name;

    private List<User> users;

}
