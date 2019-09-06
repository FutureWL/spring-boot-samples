package io.github.futurewl.projection;

import io.github.futurewl.entity.Role;
import org.springframework.data.rest.core.config.Projection;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Projection(name = "base", types = {Role.class})
public interface RoleProjection {

    Long getId();

    String getName();

    interface PermissionSummaryProjection extends PermissionProjection {
    }

}
