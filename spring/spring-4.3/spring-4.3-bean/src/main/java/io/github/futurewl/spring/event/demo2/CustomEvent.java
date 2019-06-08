package io.github.futurewl.spring.event.demo2;

import org.springframework.context.ApplicationEvent;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:19:30
 * @version 1.0
 */
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public String toString(){
        return "My Custom Event";
    }

}
