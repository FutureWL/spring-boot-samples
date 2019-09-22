package io.github.futurewl.repository;

import io.github.futurewl.domain.User;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:18:17
 * @version 1.0
 */
public interface UserRepository {

    User saveOrUpdateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);

    List<User> listUser();

}
