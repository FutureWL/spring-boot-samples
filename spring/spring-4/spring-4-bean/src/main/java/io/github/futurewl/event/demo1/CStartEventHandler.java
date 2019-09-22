package io.github.futurewl.event.demo1;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:19:26
 * @version 1.0
 */
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {


    @Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("ContextStartedEvent Received");
    }
}
