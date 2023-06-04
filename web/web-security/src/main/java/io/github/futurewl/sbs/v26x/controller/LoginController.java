package io.github.futurewl.sbs.v26x.controller;

import io.github.futurewl.sbs.v26x.common.ResponseResult;
import io.github.futurewl.sbs.v26x.entity.User;
import io.github.futurewl.sbs.v26x.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;


    @GetMapping("/user/hello")
    //@PreAuthorize("hasAuthority('test')") // 鉴权注解
    public String hello() {
        return "Hello";
    }

    @GetMapping("/user/hello2")
    @PreAuthorize("hasAuthority('test')") // 鉴权注解
    public String hello2() {
        return "Hello";
    }

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user) {

        System.out.println(user.toString());

        return loginService.login(user);
    }

    @GetMapping("/user/logout")
    public ResponseResult logout() {
        return loginService.logout();
    }
}
