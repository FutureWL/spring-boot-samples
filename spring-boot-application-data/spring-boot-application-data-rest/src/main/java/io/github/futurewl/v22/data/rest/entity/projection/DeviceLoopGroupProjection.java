package io.github.futurewl.v22.data.rest.entity.projection;

import io.github.futurewl.v22.data.rest.entity.DeviceLoopGroup;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "base",types = DeviceLoopGroup.class)
public interface DeviceLoopGroupProjection  {
    String getName();
}
