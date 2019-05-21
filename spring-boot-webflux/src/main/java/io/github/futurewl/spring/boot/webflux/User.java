package io.github.futurewl.spring.boot.webflux;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-21:23:57
 * @version 1.0
 */
@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String id;
    @Indexed(unique = true)
    private String username;
    private String phone;
    private String email;
    private String name;
    private Date birthday;
}
