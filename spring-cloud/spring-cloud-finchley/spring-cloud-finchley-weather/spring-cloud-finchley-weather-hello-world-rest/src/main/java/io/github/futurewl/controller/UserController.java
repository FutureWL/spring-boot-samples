package io.github.futurewl.controller;

import io.github.futurewl.domain.User;
import io.github.futurewl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:18:15
 * @version 1.0
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
        return userRepository.listUser();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userRepository.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.saveOrUpdateUser(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        User oldUser = userRepository.getUserById(id);
        if (oldUser != null) {
            user.setId(id);
            userRepository.saveOrUpdateUser(user);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userRepository.deleteUser(id);
    }

}
