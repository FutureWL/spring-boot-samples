package io.github.futurewl.spring.event.demo2;

import org.springframework.context.ApplicationListener;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:19:31
 * @version 1.0
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
