package io.github.futurewl.spring.boot.data.rest.security.service;

import io.github.futurewl.spring.boot.data.rest.security.entity.User;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface UserService {
    User findById(Long id);
}
