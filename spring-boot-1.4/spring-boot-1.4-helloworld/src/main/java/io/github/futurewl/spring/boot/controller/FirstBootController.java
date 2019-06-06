package io.github.futurewl.spring.boot.controller;

import io.github.futurewl.spring.boot.model.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:17:56
 * @version 1.0
 */
@Api("user相关api")
@RestController
@RequestMapping("/user")
public class FirstBootController {

    @ApiOperation("根据ID获取用户信息")
    @ApiImplicitParams(
            @ApiImplicitParam(paramType = "query", name = "id", dataType = "int", required = true, value = "用户的ID", defaultValue = "1")
    )
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没有填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public User getUserInfo(@RequestParam("id") int id) {
        if (id == 1) {
            return new User(1, "小红", "123456");
        }
        return new User(2, "小刚", "123456");
    }

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return "hello,this is my first boot program!!!";
    }

}
