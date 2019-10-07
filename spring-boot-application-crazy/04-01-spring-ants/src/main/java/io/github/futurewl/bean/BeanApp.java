package io.github.futurewl.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BeanApp {

    public static void main(String[] args) {
        SpringApplication.run(BeanApp.class, args);
    }

    @Autowired
    ApplicationContext ctx;

    /**
     * 输出容器中全部的bean
     *
     * @return
     */
    @GetMapping("/print")
    public String printBeans() {
        // 根据类型获取bean的名称
        String[] names = ctx.getBeanNamesForType(MyBean.class);
        for (String name : names) {
            System.out.println(name);
        }
        return "";
    }
}
