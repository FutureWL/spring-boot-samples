package io.github.futurewl.spring.boot.mq.jms;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:14:12
 * @version 1.0
 */
public class Msg implements MessageCreator {

    @Override
    public Message createMessage(Session session) throws JMSException {
        return session.createTextMessage("测试消息");
    }

}
