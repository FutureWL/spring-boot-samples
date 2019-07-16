package io.github.futurewl.service.impl;

import io.github.futurewl.repository.UserRepository;
import io.github.futurewl.repository.UserRepository2;
import io.github.futurewl.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserRepository2 userRepository2;

    public UserServiceImpl(UserRepository userRepository, UserRepository2 userRepository2) {
        this.userRepository = userRepository;
        this.userRepository2 = userRepository2;
    }

    public void hello() {
        userRepository2.findOne(1L);
    }

}
