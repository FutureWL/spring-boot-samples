package io.github.futurewl.sprng.boot.web.beetl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述：用户实体
 *
 * @author weilai create by 2018-12-07:12:47
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    private String username;
    private String password;
}
