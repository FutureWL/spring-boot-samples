package io.github.futurewl.service.impl;

import io.github.futurewl.entity.Role;
import io.github.futurewl.entity.User;
import io.github.futurewl.repository.RoleRepository;
import io.github.futurewl.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void test() {


        User user = new User();
        user.setUsername("admin");
        user.setEmail("123@qq.com");

        Role role = new Role();
        role.setName("管理员");
        role = roleRepository.save(role);
        user.setRole(role);

        userRepository.save(user);

        User user1 = new User();
        user1.setUsername("admin");
        user1.setEmail("123@qq.com");

        Role role1 = new Role();
        role1.setName("管理员1");
        role1 = roleRepository.save(role1);
        user1.setRole(role);

        userRepository.save(user1);


    }

    /**
     * [
     * User(id=1, username=admin, email=123@qq.com, role=Role(id=1, name=管理员)),
     * User(id=2, username=admin, email=123@qq.com, role=Role(id=2, name=管理员1)),
     * User(id=3, username=admin, email=123@qq.com, role=Role(id=3, name=管理员)),
     * User(id=4, username=admin, email=123@qq.com, role=Role(id=3, name=管理员)),
     * User(id=5, username=admin, email=123@qq.com, role=Role(id=5, name=管理员)),
     * User(id=6, username=admin, email=123@qq.com, role=Role(id=5, name=管理员))
     * ]
     */
    @Test
    public void showAllUser() {
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }


    /**
     * [
     * Role(id=1, name=管理员),
     * Role(id=2, name=管理员1),
     * Role(id=3, name=管理员),
     * Role(id=4, name=管理员1),
     * Role(id=5, name=管理员),
     * Role(id=6, name=管理员1)
     * ]
     */
    @Test
    public void showAllRole() {
        List<Role> roles = roleRepository.findAll();
        System.out.println(roles);
    }


}
