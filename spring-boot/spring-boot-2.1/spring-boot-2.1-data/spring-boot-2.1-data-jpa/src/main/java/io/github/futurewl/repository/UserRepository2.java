package io.github.futurewl.repository;

import io.github.futurewl.entity.User;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface UserRepository2 extends MyBaseRepository<User, Long> {
    User findByEmailAndUsername(String email, String username);
}
