package io.github.futurewl.spring.boot.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:18:00
 * @version 1.0
 */
@ApiModel("用户模型")
@AllArgsConstructor
@Getter
public class User {

    @ApiModelProperty("用户ID")
    private int id;

    @ApiModelProperty("用户姓名")
    private String name;

    @ApiModelProperty("用户密码")
    private String password;

}
