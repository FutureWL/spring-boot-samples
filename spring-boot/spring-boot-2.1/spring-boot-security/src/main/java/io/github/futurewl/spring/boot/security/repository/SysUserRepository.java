package io.github.futurewl.spring.boot.security.repository;

import io.github.futurewl.spring.boot.security.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:16:10
 * @version 1.0
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}
