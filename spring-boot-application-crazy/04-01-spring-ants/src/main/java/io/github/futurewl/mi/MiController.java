package io.github.futurewl.mi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class MiController {


    @Autowired
    private ApplicationContext ctx;

    private MiBeanA getMiBean() {
        return (MiBeanA) ctx.getBean("bean1");
    }

    @GetMapping("/mi")
    public String mi() {
        System.out.println(this);
        System.out.println(createMiBean());
        System.out.println();
        return "";
    }

    @Lookup("bean1")
    public abstract MiBeanA createMiBean();
}
