package io.github.futurewl.spring.log.demo1;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:22:09
 * @version 1.0
 */
public class MainApp {
    static Logger log = Logger.getLogger(MainApp.class.getName());

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("log/LogBeans1.xml");
        log.info("Going to create HelloWord Obj");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        log.info("Exiting the program");
    }
}
