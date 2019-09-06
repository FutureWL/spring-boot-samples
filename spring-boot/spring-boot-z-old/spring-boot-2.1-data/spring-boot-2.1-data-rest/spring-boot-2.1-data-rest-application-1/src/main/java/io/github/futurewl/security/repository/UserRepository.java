package io.github.futurewl.security.repository;

import io.github.futurewl.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
