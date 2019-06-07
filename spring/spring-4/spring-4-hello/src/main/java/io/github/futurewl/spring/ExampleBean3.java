package io.github.futurewl.spring;

import org.springframework.beans.factory.DisposableBean;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:15:30
 * @version 1.0
 */
public class ExampleBean3 implements DisposableBean {
    public void destroy() {
        // do some destruction work
        System.out.println("destroy3");
    }
}
