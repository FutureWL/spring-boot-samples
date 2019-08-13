package io.github.futurewl.dao1;

import io.github.futurewl.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sang on 2018/7/16.
 */
public interface UserDao extends JpaRepository<User,Integer>{
}
