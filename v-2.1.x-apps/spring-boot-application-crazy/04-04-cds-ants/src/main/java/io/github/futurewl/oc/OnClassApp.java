package io.github.futurewl.oc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class OnClassApp {

    public static void main(String[] args) {
        SpringApplication.run(OnClassApp.class, args);
    }

    @Autowired
    ApplicationContext ctx;

    @RequestMapping("/bean")
    public String getBean() {
        Map<String, MyBean> beans = ctx.getBeansOfType(MyBean.class);
        System.out.println(beans.size());
        return "success";
    }
}
