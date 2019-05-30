package io.github.futurewl.spring.boot.mq.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:14:14
 * @version 1.0
 */
@Component
public class Receiver {

    @JmsListener(destination = "my-destination")
    public void receiveMessage(String message) {
        System.out.println("接受到：<" + message + ">");
    }

}
