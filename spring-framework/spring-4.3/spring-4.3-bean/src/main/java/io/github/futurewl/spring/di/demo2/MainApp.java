package io.github.futurewl.spring.di.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：Spring 基于构造函数的依赖注入
 * 由 陈 创建，Loen 最后一次修改 2016-08-12
 * Spring 基于构造函数的依赖注入
 * 当容器调用带有一组参数的类构造函数时，基于构造函数的 DI 就完成了，其中每个参数代表一个对其他类的依赖。
 * <p>
 * 接下来，我们将通过示例来理解 Spring 基于构造函数的依赖注入。
 * <p>
 * 示例：
 * 下面的例子显示了一个类 TextEditor，只能用构造函数注入来实现依赖注入。
 * <p>
 * 让我们用 Eclipse IDE 适当地工作，并按照以下步骤创建一个 Spring 应用程序。
 * <p>
 * 步骤	描述
 * 1	创建一个名为 SpringExample 的项目，并在创建的项目中的 src 文件夹下创建包 com.tutorialspoint 。
 * 2	使用 Add External JARs 选项添加必需的 Spring 库，解释见 Spring Hello World Example chapter.
 * 3	在 com.tutorialspoint 包下创建 Java类 TextEditor，SpellChecker 和 MainApp。
 * 4	在 src 文件夹下创建 Beans 的配置文件 Beans.xml 。
 * 5	最后一步是创建所有 Java 文件和 Bean 配置文件的内容并按照如下所示的方法运行应用程序。
 *
 * @author weilai create by 2019-06-07:17:07
 * @version 1.0
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "di/DiBeans2.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
