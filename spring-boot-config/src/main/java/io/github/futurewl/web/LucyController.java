package io.github.futurewl.web;


import io.github.futurewl.bean.ConfigBean;
import io.github.futurewl.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @Autowired
    public LucyController(ConfigBean configBean) {
        this.configBean = configBean;
    }

    @RequestMapping(value = "/lucy")
    public String miya() {
        return configBean.getGreeting() + " >>>>" + configBean.getName() + " >>>>" + configBean.getUuid() + " >>>>" + configBean.getMax();
    }

    @Autowired
    User user;

    @RequestMapping(value = "/user")
    public String user() {
        return user.getName() + user.getAge();
    }

}
