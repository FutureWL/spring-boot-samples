package io.github.futurewl.projection;

import io.github.futurewl.entity.User;
import org.springframework.data.rest.core.config.Projection;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Projection(name = "base", types = {User.class})
public interface UserProjection {

    Long getId();

    String getUsername();

}
