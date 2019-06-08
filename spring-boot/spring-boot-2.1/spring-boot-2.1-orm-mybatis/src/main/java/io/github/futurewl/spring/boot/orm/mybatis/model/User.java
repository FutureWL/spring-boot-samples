package io.github.futurewl.spring.boot.orm.mybatis.model;

import lombok.Data;

/**
 * 功能描述：
 *
 * @author weilai create by 2018-12-07:22:21
 * @version 1.0
 */
@Data
public class User {
    private Long id;
    private String name;
    private String phone;
}
