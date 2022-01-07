package io.github.futurewl.dao;

import io.github.futurewl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

    /**
     * 根据名称和密码查询用户数据
     */
    public User findByNameAndPasswd(String name, String passwd);
}
