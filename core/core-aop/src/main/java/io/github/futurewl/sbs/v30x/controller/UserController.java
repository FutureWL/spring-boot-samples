package io.github.futurewl.sbs.v31x.controller;


import io.github.futurewl.sbs.v31x.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUserById")
    public String getUserById(Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("/deleteUserById")
    public void deleteUserById(Integer id) {
        userService.deleteUserById(id);
    }

}
