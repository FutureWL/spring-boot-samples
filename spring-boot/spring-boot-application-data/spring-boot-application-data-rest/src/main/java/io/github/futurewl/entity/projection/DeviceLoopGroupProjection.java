package io.github.futurewl.entity.projection;

import io.github.futurewl.entity.DeviceLoopGroup;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "base",types = DeviceLoopGroup.class)
public interface DeviceLoopGroupProjection  {
    String getName();
}
