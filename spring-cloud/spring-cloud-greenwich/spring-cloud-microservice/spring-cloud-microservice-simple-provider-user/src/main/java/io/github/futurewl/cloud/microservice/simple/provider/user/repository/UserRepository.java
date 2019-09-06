package io.github.futurewl.cloud.microservice.simple.provider.user.repository;

import io.github.futurewl.cloud.microservice.simple.provider.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:17:14
 * @version 1.0
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
