package io.github.futurewl.spring.boot.data.rest.security.service.impl;

import io.github.futurewl.spring.boot.data.rest.security.entity.User;
import io.github.futurewl.spring.boot.data.rest.security.repository.UserRepository;
import io.github.futurewl.spring.boot.data.rest.security.service.UserService;
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
}
