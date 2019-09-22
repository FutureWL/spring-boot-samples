package io.github.futurewl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:21:42
 * @version 1.0
 */
@Controller
public class WebController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {
        return "final";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect2() {
        return "redirect:/pages/final.htm";
    }
}
