package io.github.futurewl.spring.boot.helloworld;

import io.github.futurewl.spring.boot.helloworld.prop.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：HelloWorld Spring Boot 应用启动
 *
 * @author weilai create by 2018-12-05:18:05
 * @version 1.0
 */
@RestController
@SpringBootApplication
public class HelloWorldApplication {

    @Value("${userinfo.name}")
    private String username;

    @Value("${userinfo.age}")
    private Integer age;

    @Autowired
    private Environment environment;

    @Autowired
    private UserProperties userProperties;

    @RequestMapping("/")
    public String home() {
        return "Hello " + username + age + "!";
    }

    @RequestMapping("/a")
    public String homea() {
        return "Helloaaaaa "
                + environment.getProperty("userinfo.name")
                + environment.getProperty("userinfo.age")
                + "!";
    }

    @RequestMapping("/b")
    public String homeb() {
        return "Hellobbb "
                + userProperties.getName()
                + userProperties.getAge()
                + "!";
    }

    /**
     * 入口方法
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}
