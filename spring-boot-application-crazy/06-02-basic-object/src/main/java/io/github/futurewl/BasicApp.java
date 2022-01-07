package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class BasicApp {

    public static void main(String[] args) {
        SpringApplication.run(BasicApp.class, args);
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest request, HttpSession session) {
        request.setAttribute("name1", "Angus");
        session.setAttribute("name2", "Paris");
        request.getServletContext().setAttribute("name3", "Test");
        return "test";
    }

    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/np")
    public String np(@RequestParam String userName,
                     @RequestParam String passwd, HttpServletRequest request) {
        request.setAttribute("reqData", "reqData");
        request.getSession().setAttribute("sesData", "sesData");
        request.getServletContext().setAttribute("appData", "appData");
        return "np";
    }

    @RequestMapping("/ses")
    public String ses(HttpSession session, HttpServletRequest request) {
        session.setAttribute("myData", "Angus");
        request.setAttribute("testData", "Paris");
        return "ses";
    }
}
