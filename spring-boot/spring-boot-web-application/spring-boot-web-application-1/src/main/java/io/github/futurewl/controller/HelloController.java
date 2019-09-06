package io.github.futurewl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：REST 风格接口
 *
 * @author weilai
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello spring boot!";
    }
}
