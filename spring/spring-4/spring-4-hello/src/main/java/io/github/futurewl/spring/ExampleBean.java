package io.github.futurewl.spring;

import org.springframework.beans.factory.InitializingBean;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:15:30
 * @version 1.0
 */
public class ExampleBean implements InitializingBean {
    public void afterPropertiesSet() {
        // do some initialization work
        System.out.println("afterPropertiesSet");
    }



}
