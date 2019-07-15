package io.github.futurewl.spring.boot.data.rest.security.entity.projection;

import io.github.futurewl.spring.boot.data.rest.security.entity.Role;
import org.springframework.data.rest.core.config.Projection;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Projection(name = "base", types = {Role.class})
public interface RoleProjection {
    String getName();
}
