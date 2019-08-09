package io.github.futurewl.security.entity.projection;

import io.github.futurewl.security.entity.Role;
import io.github.futurewl.security.entity.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Projection(name = "base", types = {User.class})
public interface UserProjection {
    String getName();

    @Projection(name = "summeryRoleProjection", types = {Role.class})
    interface SummeryRoleProjection extends RoleProjection {
    }

}

@Projection(name = "withRoles", types = {User.class})
interface UserProjectionWithRoles extends UserProjection {
    List<SummeryRoleProjection> getRoles();
}
