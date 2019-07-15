package io.github.futurewl.spring.boot.data.rest.security.service;

import io.github.futurewl.spring.boot.data.rest.security.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 功能描述：
 *
 * @author weilai
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findById() {
        User user = userService.findById(1L);
        System.out.println(user.toString());
    }
}