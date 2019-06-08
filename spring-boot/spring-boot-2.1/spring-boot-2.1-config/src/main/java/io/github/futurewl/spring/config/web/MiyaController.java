package io.github.futurewl.spring.config.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:13:51
 * @version 1.0
 */
@RestController
public class MiyaController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    @RequestMapping(value = "/miya")
    public String miya() {
        return name + ":" + age;
    }

}
