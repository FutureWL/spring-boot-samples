package io.github.futurewl.sprng.boot.web.beetl.controller;

import io.github.futurewl.sprng.boot.web.beetl.entity.User;
import io.github.futurewl.sprng.boot.web.beetl.form.OrderPostForm;
import io.github.futurewl.sprng.boot.web.beetl.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 功能描述：HelloWorld 控制器
 *
 * @author weilai create by 2018-12-07:12:45
 * @version 1.0
 */
@Controller
@RequestMapping("/test")
public class HelloWorldController {

    private final UserService userService;

    public HelloWorldController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/index.html")
    public String say(Model model) {
        model.addAttribute("name", "hello,world");
        return "/index.btl";
    }

    @ResponseBody
    @RequestMapping("/sayBody")
    public String sayBody(Model model) {
        model.addAttribute("name", "hello,world");
        return "hello,world!";
    }

    @RequestMapping(value = "/all.json", method = RequestMethod.GET)
    public @ResponseBody
    List<User> allUser() {
        return userService.allUser();
    }

    @ResponseBody
    @RequestMapping(value = "/get/{id}.json", method = RequestMethod.GET)
    public User getUserById(@PathVariable String id) {
        try {
            return userService.getUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @ResponseBody
    @GetMapping(value = "/consumes/test.json", consumes = "application/json")
    public User forJson() throws Exception {
        return userService.getUserById("1");
    }

    @GetMapping(value = "/{userId}/get.html")
    public String getUser(@PathVariable String userId, Model model) throws Exception {
        User userInfo = userService.getUserById(userId);
        model.addAttribute(userInfo);
        return "/admin/userInfo.btl";
    }

    @GetMapping(value = "/user/get.html")
    public String getUser2(@RequestParam(name = "id", required = true) String userId, Model model) throws Exception {
        User userInfo = userService.getUserById(userId);
        model.addAttribute(userInfo);
        return "/admin/userInfo.btl";
    }

    @ResponseBody
    @PostMapping(path = "/update.json", params = "action=save")
    public void saveUser() {
        System.out.println("call save");
    }

    @GetMapping(path = "/update.json")
    @ResponseBody
    public String updateUser(User user) {
        System.out.println(user);
        return "success";
    }

    @PostMapping(path = "/form")
    @ResponseBody
    public String updateUser(OrderPostForm form) {
        System.out.println(form);
        return "success";
    }

}
