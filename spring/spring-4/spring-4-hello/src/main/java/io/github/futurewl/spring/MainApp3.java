package io.github.futurewl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:15:10
 * @version 1.0
 */
public class MainApp3 {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext(
                        "spring/spring-4/spring-4-hello/src/main/resources/Beans.xml"
                );
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
    }
}
