package io.github.futurewl.spring.event.demo2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：自定义活动
 *
 * @author weilai create by 2019-06-07:19:31
 * @version 1.0
 */
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "event/eventBeans2.xml");
        CustomEventPublisher cvp = (CustomEventPublisher)
                context.getBean("customEventPublisher");
        cvp.publish();
        cvp.publish();
        cvp.publish();
        cvp.publish();
        cvp.publish();
    }
}
