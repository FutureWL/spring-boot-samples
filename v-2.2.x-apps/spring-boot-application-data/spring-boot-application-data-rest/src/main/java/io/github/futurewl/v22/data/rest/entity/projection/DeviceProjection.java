package io.github.futurewl.v22.data.rest.entity.projection;

import io.github.futurewl.v22.data.rest.entity.Device;
import io.github.futurewl.v22.data.rest.entity.DeviceLoop;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(name="base" ,types = {Device.class})
public interface DeviceProjection  {

    String getName();


    @Projection(name = "deviceLoopSummary",types = DeviceLoop.class)
    interface DeviceLoopSummary extends DeviceLoopProjection{

    }

    @Projection(name = "deviceLoopSummaryWithDeviceLoopGroupSummary",types = DeviceLoop.class)
    interface DeviceLoopSummaryWithDeviceLoopGroupSummary extends DeviceLoopProjection{
        DeviceLoopGroupSummary getDeviceLoopGroup();
    }

}

@Projection(name = "withDeviceLoop",types = Device.class)
interface DeviceWithDeviceLoop extends DeviceProjection{
    Set<DeviceLoopSummary> getDeviceLoops();
}

@Projection(name = "withDeviceLoopSummaryWithDeviceLoopGroupSummary",types = Device.class)
interface DeviceWithDeviceLoopSummaryWithDeviceLoopGroupSummary extends DeviceProjection{
    Set<DeviceLoopSummaryWithDeviceLoopGroupSummary> getDeviceLoops();
}


