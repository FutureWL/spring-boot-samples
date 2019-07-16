package io.github.futurewl.service.impl;

import io.github.futurewl.repository.UserRepository;
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

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
