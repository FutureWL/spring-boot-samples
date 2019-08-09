package io.github.futurewl.security.service.impl;

import io.github.futurewl.security.entity.User;
import io.github.futurewl.security.repository.UserRepository;
import io.github.futurewl.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void handleUserCreateBefore(User user) {
        System.out.println("处理创建用户之前");
    }

    @Override
    public void handleUserCreateAfter(User user) {
        System.out.println("处理创建用户之后");
    }

    @Override
    public void handleUserSaveBefore(User user) {
        System.out.println("处理保存用户之前");
    }

    @Override
    public void handleUserSaveAfter(User user) {
        System.out.println("处理保存用户之后");
    }

    @Override
    public void handleUserDeleteBefore(User user) {
        System.out.println("处理删除用户之前");
    }

    @Override
    public void handleUserDeleteAfter(User user) {
        System.out.println("处理删除用户之后");
    }

    @Override
    public void handleUserLinkSaveBefore(User user) {
        System.out.println("处理LinkSave用户之前");
    }

    @Override
    public void handleUserLinkSaveAfter(User user) {
        System.out.println("处理LinkSave用户之后");
    }

    @Override
    public void handleUserLinkDeleteBefore(User user) {
        System.out.println("处理LinkDelete用户之前");
    }

    @Override
    public void handleUserLinkDeleteAfter(User user) {
        System.out.println("处理LinkDelete用户之后");
    }
}
