package io.github.futurewl.pv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class PvApp {

    public static void main(String[] args) {
        SpringApplication.run(PvApp.class, args);
    }

    @RequestMapping(value = "/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable String name) {
        return "hello, " + name;
    }

    @RequestMapping(value = "/test/{myName}")
    @ResponseBody
    public String test(@PathVariable("myName") String abc) {
        return "test, " + abc;
    }
}
