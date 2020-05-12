package io.github.futurewl.controller;

import io.github.futurewl.entity.User;
import io.github.futurewl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(@ModelAttribute User user) {
        return "index";
    }

    @PostMapping(value = "/login")
    public String login(@ModelAttribute User user, HttpSession session, Model model) {
        System.out.println(user.getName() + "---" + user.getPasswd());
        User loginUser = userService.login(user);
        if (loginUser == null) {
            // 登录失败，返回登录界面
            model.addAttribute("msg", "用户名密码错误");
            return "index";
        } else {
            // 登录成功
            session.setAttribute("user", loginUser);
            return "redirect:/main";
        }
    }
}
