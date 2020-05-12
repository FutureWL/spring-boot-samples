package io.github.futurewl.demo1.service.impl;

import io.github.futurewl.demo1.repository.UserRepository;
import io.github.futurewl.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

}
