package io.github.futurewl.spring.boot.demo1.mvc.controller;

import io.github.futurewl.spring.boot.demo1.mvc.entity.User;
import io.github.futurewl.spring.boot.demo1.mvc.form.OrderPostForm;
import io.github.futurewl.spring.boot.demo1.mvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.InputStream;
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

    @GetMapping(value = "/{userId}/get2.html")
    public ModelAndView getUser2(@PathVariable String userId, ModelAndView view) throws Exception {
        User userInfo = userService.getUserById(userId);
        view.addObject("user", userInfo);
        view.setViewName("/userInfo.btl");
        return view;
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

    /**
     * 通过 MultipartFile 处理文件上传
     *
     * @param name
     * @param file
     * @return
     */
    @PostMapping
    @ResponseBody
    public String handleFormUpload(String name, MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            InputStream inputStream = file.getInputStream();

            return "success";
        }
        return "failure";
    }

}
