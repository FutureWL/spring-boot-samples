package io.github.futurewl.service;

import io.github.futurewl.entity.User;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface UserService {

    User findById(Long id);

}
