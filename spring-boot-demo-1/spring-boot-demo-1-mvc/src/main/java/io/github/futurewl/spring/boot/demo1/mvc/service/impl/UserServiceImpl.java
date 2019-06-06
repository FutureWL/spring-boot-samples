package io.github.futurewl.spring.boot.demo1.mvc.service.impl;

import io.github.futurewl.spring.boot.demo1.mvc.entity.User;
import io.github.futurewl.spring.boot.demo1.mvc.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：用户服务接口实现
 *
 * @author weilai create by 2018-12-07:12:50
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl() {
        users = new ArrayList<User>();
        users.add(new User("1", "admin", "admin"));
        users.add(new User("2", "super", "super"));
        users.add(new User("3", "root", "weilai"));
    }

    public List<User> allUser() {
        return users;
    }

    public User getUserById(String id) throws Exception {
        for (User user : users) {
            if (id.equals(user.getId())) {
                return user;
            }
        }
        throw new Exception();
    }

}
