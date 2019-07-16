package io.github.futurewl.spring.boot.data.rest.security.handler;

import io.github.futurewl.spring.boot.data.rest.security.entity.User;
import io.github.futurewl.spring.boot.data.rest.security.service.UserService;
import org.springframework.data.rest.core.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Component
@RepositoryEventHandler
public class UserEventHandler {

    private final UserService userService;

    public UserEventHandler(UserService userService) {
        this.userService = userService;
    }

    // 定义创建之前的动作
    @HandleBeforeCreate
    public void handleUserCreateBefore(User user) {
        userService.handleUserCreateBefore(user);
    }

    // 定义创建之后的动作
    @HandleAfterCreate
    public void handleUserCreateAfter(User user) {
        userService.handleUserCreateAfter(user);
    }

    // 定义save之前的动作
    @HandleBeforeSave
    public void handleUserSaveBefore(User user) {
        userService.handleUserSaveBefore(user);
    }

    // 定义save之后的动作
    @HandleBeforeSave
    public void handleUserSaveAfter(User user) {
        userService.handleUserSaveAfter(user);
    }

    // 定义delete之前的动作
    @HandleBeforeDelete
    public void handleUserDeleteBefore(User user) {
        userService.handleUserDeleteBefore(user);
    }

    // 定义delete之后的动作
    @HandleAfterDelete
    public void handleUserDeleteAfter(User user) {
        userService.handleUserDeleteAfter(user);
    }

    // 定义LinkSave之前的动作
    @HandleBeforeLinkSave
    public void handleUserLinkSaveBefore(User user) {
        userService.handleUserLinkSaveBefore(user);
    }

    // 定义LinkSave之后的动作
    @HandleAfterLinkSave
    public void handleUserLinkSaveAfter(User user) {
        userService.handleUserLinkSaveAfter(user);
    }

    // 定义LinkSave之前的动作
    @HandleBeforeLinkDelete
    public void handleUserLinkDeleteBefore(User user) {
        userService.handleUserLinkDeleteBefore(user);
    }

    // 定义LinkSave之后的动作
    @HandleAfterLinkDelete
    public void handleUserLinkDeleteAfter(User user) {
        userService.handleUserLinkDeleteAfter(user);
    }

}
