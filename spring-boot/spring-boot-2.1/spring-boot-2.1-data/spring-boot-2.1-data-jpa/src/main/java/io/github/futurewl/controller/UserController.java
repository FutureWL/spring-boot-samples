package io.github.futurewl.controller;

import io.github.futurewl.entity.User;
import io.github.futurewl.repository.UserRepository;
import io.github.futurewl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/add")
    public void addNewUser(
            @RequestParam String username,
            @RequestParam String email
    ) {
        User u = new User();
        u.setUsername(username);
        u.setEmail(email);
        userRepository.save(u);
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/info")
    @ResponseBody
    public User findOne(@RequestParam Long id) {
        return userRepository.findById(id).get();
    }

    @GetMapping(path = "/delete")
    public void delete(@RequestParam Long id) {
        userRepository.deleteById(id);
    }

    @GetMapping(path = "/page")
    @ResponseBody
    public Page<User> getAllUserByPage() {
        return userRepository.findAll(
                new PageRequest(1, 20, new Sort(new Sort.Order(Sort.Direction.ASC, "name")))
        );
    }


    @GetMapping(path = "/sort")
    @ResponseBody
    public Iterable<User> getAllUsersWithSort() {
        return userRepository.findAll(
                new Sort(new Sort.Order(Sort.Direction.ASC, "name"))
        );
    }

}
