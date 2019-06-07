package io.github.futurewl.spring.demo6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:16:48
 * @version 1.0
 */
public class InitHelloWorld implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
}
