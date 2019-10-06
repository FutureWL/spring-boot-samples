package io.github.futurewl.demo1.entity.projection;

import io.github.futurewl.demo1.entity.DeviceLoopGroup;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "base",types = DeviceLoopGroup.class)
public interface DeviceLoopGroupProjection  {
    String getName();
}
