package io.github.futurewl.spring.boot.web.mvc.entry;

import lombok.Data;
import org.springframework.boot.jackson.JsonComponent;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-01-31:13:00
 * @version 1.0
 */
@Data
@JsonComponent
public class User {

    private Integer id;

    private String username;

    private String password;

}
