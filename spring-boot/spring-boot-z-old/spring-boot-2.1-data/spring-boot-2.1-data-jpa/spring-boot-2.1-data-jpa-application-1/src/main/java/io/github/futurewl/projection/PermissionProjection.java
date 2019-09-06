package io.github.futurewl.projection;

import io.github.futurewl.entity.Permission;
import org.springframework.data.rest.core.config.Projection;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Projection(name = "base", types = {Permission.class})
public interface PermissionProjection {

    Long getId();

    String getName();

}
