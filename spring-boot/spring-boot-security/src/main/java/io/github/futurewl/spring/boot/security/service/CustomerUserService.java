package io.github.futurewl.spring.boot.security.service;

import io.github.futurewl.spring.boot.security.entity.SysUser;
import io.github.futurewl.spring.boot.security.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:16:10
 * @version 1.0
 */
@Service
public class CustomerUserService implements UserDetailsService {

    @Autowired
    SysUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
    }

}
