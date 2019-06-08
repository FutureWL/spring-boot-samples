package io.github.futurewl.spring.event.demo1;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:19:26
 * @version 1.0
 */
public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {


    @Override
    public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("ContextStoppedEvent Received");
    }
}
