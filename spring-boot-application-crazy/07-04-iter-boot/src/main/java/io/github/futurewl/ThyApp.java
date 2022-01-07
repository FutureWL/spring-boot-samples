package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.context.LazyContextVariable;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller
public class ThyApp {

    public static void main(String[] args) {
        SpringApplication.run(ThyApp.class, args);
    }

    @RequestMapping("/lazy/{show}")
    public String lazy(Model model, @PathVariable("show") boolean show) {
        model.addAttribute("users", new LazyContextVariable() {

            @Override
            protected Object loadValue() {
                return queryUsers();
            }
        });
        model.addAttribute("show", show);
        return "lazy";
    }

    private List<User> queryUsers() {
        System.out.println("执行查询数据");
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "userA"));
        users.add(new User(2, "userB"));
        return users;
    }
}