package io.github.futurewl.mv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class MvApp {

    public static void main(String[] args) {
        SpringApplication.run(MvApp.class, args);
    }

    @GetMapping(value = "/car/{id}")
    @ResponseBody
    public String pathA(@PathVariable Integer id,
                        @MatrixVariable String color,
                        @MatrixVariable String year) {
        System.out.println(id);
        System.out.println(color);
        System.out.println(year);
        return "test";
    }

}
