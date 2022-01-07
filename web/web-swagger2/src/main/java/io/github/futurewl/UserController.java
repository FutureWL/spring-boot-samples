package io.github.futurewl;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "用户数据接口")
public class UserController {

    @GetMapping("/user/{id}")
    @ApiOperation(value = "查询用户", notes = "根据ID查询用户")
    @ApiImplicitParam(paramType = "path", name = "id", value = "用户ID", required = true)
    public String getUserById(@PathVariable Integer id) {
        return "/user/" + id;
    }

    @DeleteMapping("/user/{id}")
    @ApiResponses({
            @ApiResponse(code = 200, message = "删除成功!"),
            @ApiResponse(code = 500, message = "删除失败!")})
    @ApiOperation(value = "删除用户", notes = "根据ID删除用户")
    @ApiImplicitParam(paramType = "path", name = "id", value = "用户ID", required = true)
    public Integer deleteUserById(@PathVariable Integer id) {
        return id;
    }

    @PostMapping("/user")
    @ApiOperation(value = "添加用户", notes = "添加一个用户，传入用户名和地址")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    paramType = "query", name = "username", value = "用户名", required = true, defaultValue = "weilai"),
            @ApiImplicitParam(
                    paramType = "query", name = "address", value = "用户地址", required = true, defaultValue = "nanchang")})
    public String addUser(@RequestParam String username, @RequestParam String address) {
        return username + ":" + address;
    }

    @PutMapping("/user")
    @ApiOperation(value = "修改用户", notes = "修改用户，传入用户信息")
    public String updateUser(@RequestBody User user) {
        return user.toString();
    }


}
