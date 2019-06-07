package io.github.futurewl.spring.ioc.demo7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:16:52
 * @version 1.0
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans7.xml");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}
