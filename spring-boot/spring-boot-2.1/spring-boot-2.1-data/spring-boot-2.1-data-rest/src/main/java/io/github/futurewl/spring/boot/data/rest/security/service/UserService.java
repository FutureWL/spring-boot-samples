package io.github.futurewl.spring.boot.data.rest.security.service;

import io.github.futurewl.spring.boot.data.rest.security.entity.User;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface UserService {

    User findById(Long id);

    void handleUserCreateBefore(User user);

    void handleUserCreateAfter(User user);

    void handleUserSaveBefore(User user);

    void handleUserSaveAfter(User user);

    void handleUserDeleteBefore(User user);

    void handleUserDeleteAfter(User user);

    void handleUserLinkSaveBefore(User user);

    void handleUserLinkSaveAfter(User user);

    void handleUserLinkDeleteBefore(User user);

    void handleUserLinkDeleteAfter(User user);
}
