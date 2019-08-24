package io.github.futurewl.repository;

import io.github.futurewl.entity.Permission;
import io.github.futurewl.entity.Role;
import io.github.futurewl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Set<User> findAllByRoles(Role role);

    Set<User> findAllByRolesPermissions(Permission permission);

}
