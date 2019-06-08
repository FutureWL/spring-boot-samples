package io.github.futurewl.spring.config.web;

import io.github.futurewl.spring.config.bean.ConfigBean;
import io.github.futurewl.spring.config.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:13:51
 * @version 1.0
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class LucyController {

    private final ConfigBean configBean;
    private final User user;

    @Autowired
    public LucyController(
            ConfigBean configBean,
            User user) {
        this.configBean = configBean;
        this.user = user;
    }

    @GetMapping(value = "/lucy")
    public String lucy() {
        return configBean.getGreeting() + " >>>>" + configBean.getName() + " >>>>" + configBean.getUuid() + " >>>>" + configBean.getMax();
    }

    @GetMapping(value = "/user")
    public String user() {
        return user.getName() + user.getAge();
    }

}
