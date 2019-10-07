package io.github.futurewl.form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@SpringBootApplication
@Controller
public class FormApp {

    public static void main(String[] args) {
        SpringApplication.run(FormApp.class, args);
    }

    @GetMapping("/form")
    public String field(Model model) {
        // 设置常量到Model中
        setConstant(model);
        // 创建User
        ColorUser user = new ColorUser();
        // 设置用户喜欢的颜色
        user.setMyColors(new String[]{"yellow", "green"});
        // 设置性别
        user.setSex("lady");
        // 将用户对象设置到Model中
        model.addAttribute("user", user);
        return "form";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute ColorUser user, Model model) {
        // 设置常量到Model中
        setConstant(model);
        model.addAttribute("user", user);
        System.out.println("性别：" + user.getSex());
        System.out.println("喜欢颜色：" + Arrays.toString(user.getMyColors()));
        return "form";
    }

    private void setConstant(Model model) {
        // 定义可选 的颜色
        String[] colors = new String[]{"red", "yellow", "green"};
        // 定义可选的性别
        String[] sexes = new String[]{"man", "lady"};
        // 将常量数据设置到Model中
        model.addAttribute("colors", colors);
        model.addAttribute("sexes", sexes);
    }
}