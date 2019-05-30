package io.github.futurewl.sprng.boot.web.beetl.service;

import io.github.futurewl.sprng.boot.web.beetl.entity.User;

import java.util.List;

/**
 * 功能描述：用户服务接口
 *
 * @author weilai create by 2018-12-07:12:49
 * @version 1.0
 */
public interface UserService {

    /**
     * 获得用户列表
     *
     * @return 用户列表
     */
    List<User> allUser();

    /**
     * 通过 id 获得用户对象
     *
     * @param id 用户id
     * @return 用户对象
     * @throws Exception 抛出异常
     */
    User getUserById(String id) throws Exception;
}
