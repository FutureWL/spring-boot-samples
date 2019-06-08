package io.github.futurewl.spring.boot.demo1.mvc.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:11:59
 * @version 1.0
 */
@Slf4j
@Controller
public class ErrorController extends AbstractErrorController {

    @Autowired
    ObjectMapper objectMapper;

    public ErrorController() {
        super(new DefaultErrorAttributes());
    }

    @RequestMapping("/error")
    public ModelAndView getErrorPath(HttpServletRequest request, HttpServletResponse response) {
        // 处理异常
        return null;
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
