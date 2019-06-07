package io.github.futurewl.spring.ioc.demo5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：Spring Bean 生命周期
 * Bean 的生命周期
 * 理解 Spring bean 的生命周期很容易。当一个 bean 被实例化时，它可能需要执行一些初始化使它转换成可用状态。
 * 同样，当 bean 不再需要，并且从容器中移除时，可能需要做一些清除工作。
 * <p>
 * 尽管还有一些在 Bean 实例化和销毁之间发生的活动，但是本章将只讨论两个重要的生命周期回调方法，它们在 bean 的初始化和销毁的时候是必需的。
 * <p>
 * 为了定义安装和拆卸一个 bean，我们只要声明带有 init-method 和/或 destroy-method 参数的 。
 * init-method 属性指定一个方法，在实例化 bean 时，立即调用该方法。
 * 同样，destroy-method 指定一个方法，只有从容器中移除 bean 之后，才能调用该方法。
 * <p>
 * Bean的生命周期可以表达为：Bean的定义——Bean的初始化——Bean的使用——Bean的销毁
 *
 * @author weilai create by 2019-06-07:16:35
 * @version 1.0
 */
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans5.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
