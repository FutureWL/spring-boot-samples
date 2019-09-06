package io.github.futurewl.an.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:17:35
 * @version 1.0
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("an/AnBeans1.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
    }
}
