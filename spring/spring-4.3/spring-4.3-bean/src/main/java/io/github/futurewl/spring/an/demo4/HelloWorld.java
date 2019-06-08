package io.github.futurewl.spring.an.demo4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:19:17
 * @version 1.0
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        System.out.println("Your Message : " + message);
        return message;
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}
