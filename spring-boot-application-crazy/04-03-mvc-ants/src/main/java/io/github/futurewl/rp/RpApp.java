package io.github.futurewl.rp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@SpringBootApplication
@Controller
public class RpApp {

    public static void main(String[] args) {
        SpringApplication.run(RpApp.class, args);
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(@RequestParam String userName) {
        System.out.println(userName);
        return "success";
    }

    @RequestMapping(value = "/multi")
    @ResponseBody
    public String multi(@RequestParam Map<String, String> values) {
        System.out.println(values.get("myName"));
        System.out.println(values.get("passwd"));
        return "success";
    }

    @RequestMapping(value = "/mp")
    @ResponseBody
    public String multiMap(@RequestParam MultiValueMap<String, String> values) {
        System.out.println(values.getClass().getName());
        return "success";
    }
}
