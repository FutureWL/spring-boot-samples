package io.github.futurewl.spring.boot.web.mvc.controller;

import io.github.futurewl.spring.boot.web.mvc.entry.Customer;
import io.github.futurewl.spring.boot.web.mvc.entry.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-01-31:13:01
 * @version 1.0
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{user}")
    public User getUser(@PathVariable Long user) {
        return new User();
    }

    @GetMapping("/{user}/customers")
    public List<Customer> getUserCustomers(@PathVariable Long user) {
        return new ArrayList<>();
    }

    @DeleteMapping("/{user}")
    public User deleteUser(@PathVariable Long user) {
        return new User();
    }

}
