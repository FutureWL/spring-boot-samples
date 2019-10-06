package io.github.futurewl.demo1.entity.projection;

import io.github.futurewl.demo1.entity.DeviceLoop;
import io.github.futurewl.demo1.entity.DeviceLoopGroup;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "base",types = {DeviceLoop.class})
public interface DeviceLoopProjection {

    String getName();

    @Projection(name = "deviceLoopGroupSummary" ,types = DeviceLoopGroup.class)
    interface DeviceLoopGroupSummary extends DeviceLoopGroupProjection{

    }

}
