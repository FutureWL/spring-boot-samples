package io.github.futurewl.entity.projection;

import io.github.futurewl.entity.DeviceLoop;
import io.github.futurewl.entity.DeviceLoopGroup;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "base",types = {DeviceLoop.class})
public interface DeviceLoopProjection {

    String getName();

    @Projection(name = "deviceLoopGroupSummary" ,types = DeviceLoopGroup.class)
    interface DeviceLoopGroupSummary extends DeviceLoopGroupProjection{

    }

}
