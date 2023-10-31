package io.github.futurewl.sbs.v31x.service.impl;

import io.github.futurewl.sbs.v31x.entity.User;
import io.github.futurewl.sbs.v31x.mapper.UserMapper;
import io.github.futurewl.sbs.v31x.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
