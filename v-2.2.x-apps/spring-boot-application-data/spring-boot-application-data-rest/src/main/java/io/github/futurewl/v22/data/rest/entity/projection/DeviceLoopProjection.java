package io.github.futurewl.v22.data.rest.entity.projection;

import io.github.futurewl.v22.data.rest.entity.DeviceLoop;
import io.github.futurewl.v22.data.rest.entity.DeviceLoopGroup;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "base",types = {DeviceLoop.class})
public interface DeviceLoopProjection {

    String getName();

    @Projection(name = "deviceLoopGroupSummary" ,types = DeviceLoopGroup.class)
    interface DeviceLoopGroupSummary extends DeviceLoopGroupProjection{

    }

}
