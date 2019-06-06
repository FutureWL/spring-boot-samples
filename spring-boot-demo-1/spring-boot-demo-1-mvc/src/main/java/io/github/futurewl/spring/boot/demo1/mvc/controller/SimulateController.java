package io.github.futurewl.spring.boot.demo1.mvc.controller;

import org.beetl.ext.simulate.WebSimulate;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:12:13
 * @version 1.0
 */
@Configuration
public class SimulateController {

    private final WebSimulate webSimulate;

    public SimulateController(WebSimulate webSimulate) {
        this.webSimulate = webSimulate;
    }

    @RequestMapping("/api/**/*.json")
    public void simluateJson(HttpServletRequest request, HttpServletResponse response) {
        webSimulate.execute(request, response);
    }

}
