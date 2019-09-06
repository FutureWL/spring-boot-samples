package com;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-03-20:14:11
 * @version 1.0
 */
@Data
@Entity
public class User1 {
    @Id
    private Long id;
    private String username;
    private String password;
}
