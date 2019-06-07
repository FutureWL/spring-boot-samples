package io.github.futurewl.spring.mvc.controller;

import io.github.futurewl.spring.mvc.entity.Student;
import io.github.futurewl.spring.mvc.exception.SpringException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:21:38
 * @version 1.0
 */
@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/student2", method = RequestMethod.GET)
    public ModelAndView student2() {
        return new ModelAndView("student2", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());
        return "result";
    }

    @RequestMapping(value = "/addStudent2", method = RequestMethod.POST)
    @ExceptionHandler({SpringException.class})
    public String addStudent2(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
        if (student.getName().length() < 5) {
            throw new SpringException("Given name is too short");
        } else {
            model.addAttribute("name", student.getName());
        }
        if (student.getAge() < 10) {
            throw new SpringException("Given age is too low");
        } else {
            model.addAttribute("age", student.getAge());
        }
        model.addAttribute("id", student.getId());
        return "result";
    }
}
