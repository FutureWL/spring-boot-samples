package io.github.futurewl.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
@EnableAutoConfiguration
@RestController
@ComponentScan(basePackages = "org.crazyit.boot.c4.scan", excludeFilters = {
        @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MyComponent.class)
})
public class ScanApp {

    public static void main(String[] args) {
        SpringApplication.run(ScanApp.class, args);
    }

    @Autowired
    private ApplicationContext ctx;

    /**
     * 调用将会报错：NoSuchBeanDefinitionException: No bean named 'myComponent' available
     *
     * @return
     */
    @GetMapping("/scan")
    public String scan() {
        System.out.println(ctx.getBean("myComponent"));
        return "";
    }
}
