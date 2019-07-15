package io.github.futurewl.spring.boot.data.rest.security.repository;

import io.github.futurewl.spring.boot.data.rest.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
