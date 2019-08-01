package com.huntercat.glass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Controller
@RequestMapping("/index")
@SpringBootApplication
public class GlassApplication {

    @GetMapping
    public String hello() {
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(GlassApplication.class, args);
    }
}
