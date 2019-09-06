package io.github.futurewl.ioc.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：Spring Bean 作用域
 * Bean 的作用域
 * 当在 Spring 中定义一个 bean 时，你必须声明该 bean 的作用域的选项。
 * 例如，为了强制 Spring 在每次需要时都产生一个新的 bean 实例，你应该声明 bean 的作用域的属性为 prototype。
 * 同理，如果你想让 Spring 在每次需要时都返回同一个bean实例，你应该声明 bean 的作用域的属性为 singleton。
 * <p>
 * Spring 框架支持以下五个作用域，分别为singleton、prototype、request、session和global session，5种作用域说明如下所示，
 * <p>
 * 注意，如果你使用 web-aware ApplicationContext 时，其中三个是可用的。
 * <p>
 * 作用域	描述
 * singleton
 * 在spring IoC容器仅存在一个Bean实例，Bean以单例方式存在，默认值
 * <p>
 * prototype	每次从容器中调用Bean时，都返回一个新的实例，即每次调用getBean()时，相当于执行newXxxBean()
 * request	每次HTTP请求都会创建一个新的Bean，该作用域仅适用于WebApplicationContext环境
 * session	同一个HTTP Session共享一个Bean，不同Session使用不同的Bean，仅适用于WebApplicationContext环境
 * global-session	一般用于Portlet应用环境，该运用域仅适用于WebApplicationContext环境
 * 本章将讨论前两个范围，当我们将讨论有关 web-aware Spring ApplicationContext 时，其余三个将被讨论。
 *
 * @author weilai create by 2019-06-07:16:35
 * @version 1.0
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/IocBeans3.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        objA.getMessage();
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();
    }
}
