package io.github.futurewl.repository;

import io.github.futurewl.entity.Permission;
import io.github.futurewl.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    Set<Role> findAllByPermissions(Permission permission);

}
