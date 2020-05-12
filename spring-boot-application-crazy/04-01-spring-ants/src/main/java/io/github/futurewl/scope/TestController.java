package io.github.futurewl.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    // 注入一个非单态的bean
    @Autowired
    private ScopeBean bean1;

    @GetMapping("/hello2")
    public String hello() {
        System.out.println(bean1);
        return "hello";
    }
}
