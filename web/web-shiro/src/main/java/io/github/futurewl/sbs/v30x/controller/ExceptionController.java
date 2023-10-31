package io.github.futurewl.sbs.v30x.controller;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(AuthorizationException.class)
    public ModelAndView error(AuthorizationException e) {
        ModelAndView modelAndView = new ModelAndView("unauthorized");
        modelAndView.addObject("error", e.getMessage());
        return modelAndView;
    }

}
