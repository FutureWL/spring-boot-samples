package io.github.futurewl.service.impl;

import io.github.futurewl.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * 功能描述：
 *
 * @author weilai
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {


    @Autowired
    private UserService userService;


    @Test
//    @Transactional
    public void test1() {
        userService.test();
    }
//    /**

    //
    //
    //
    //
    //
    //
    // User(id=7, username=管理员, email=624263934@qq.com,
    // roles=[Role(id=7, name=管理员,
    // permissions=[
    // Permission(id=27, name=删除),
    // Permission(id=25, name=新增),
    // Permission(id=26, name=更新),
    // Permission(id=28, name=查询)])])

//     * [
//     * User(id=1, username=admin, email=123@qq.com, role=Role(id=1, name=管理员)),
//     * User(id=2, username=admin, email=123@qq.com, role=Role(id=2, name=管理员1)),
//     * User(id=3, username=admin, email=123@qq.com, role=Role(id=3, name=管理员)),
//     * User(id=4, username=admin, email=123@qq.com, role=Role(id=3, name=管理员)),
//     * User(id=5, username=admin, email=123@qq.com, role=Role(id=5, name=管理员)),
//     * User(id=6, username=admin, email=123@qq.com, role=Role(id=5, name=管理员))
//     * ]
//     */
//    @Test
//    public void showAllUser() {
//        List<User> users = userRepository.findAll();
//        System.out.println(users);
//    }
//
//
//    /**
//     * [
//     * Role(id=1, name=管理员),
//     * Role(id=2, name=管理员1),
//     * Role(id=3, name=管理员),
//     * Role(id=4, name=管理员1),
//     * Role(id=5, name=管理员),
//     * Role(id=6, name=管理员1)
//     * ]
//     */
//    @Test
//    public void showAllRole() {
//        List<Role> roles = roleRepository.findAll();
//        System.out.println(roles);
//    }

    @Test
    public void test2(){
        userService.test2();
    }


}
