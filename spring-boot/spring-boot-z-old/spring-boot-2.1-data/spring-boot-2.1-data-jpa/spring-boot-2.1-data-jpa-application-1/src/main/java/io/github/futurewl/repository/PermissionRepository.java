package io.github.futurewl.repository;

import io.github.futurewl.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
