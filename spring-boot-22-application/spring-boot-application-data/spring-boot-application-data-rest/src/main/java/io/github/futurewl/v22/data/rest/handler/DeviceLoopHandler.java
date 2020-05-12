package io.github.futurewl.v22.data.rest.handler;

import io.github.futurewl.v22.data.rest.entity.Device;
import io.github.futurewl.v22.data.rest.entity.DeviceLoop;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.collection.internal.PersistentBag;
import org.springframework.data.rest.core.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RepositoryEventHandler
public class DeviceLoopHandler {

    @HandleBeforeLinkSave
    public void beforeLinkSaveEvent(DeviceLoop deviceLoop, PersistentBag persistentBag) {
        log.info("beforeLinkSaveEvent");
    }

    @HandleAfterLinkSave
    public void afterLinkSaveEvent(DeviceLoop deviceLoop, PersistentBag persistentBag) {
        log.info("afterLinkSaveEvent");
    }

    @HandleBeforeLinkDelete
    public void beforeDeleteEvent(DeviceLoop deviceLoop, Device device) {
        log.info("beforeDeleteEvent");
    }

    @HandleAfterLinkDelete
    public void afterDeleteEvent(DeviceLoop deviceLoop, Device device) {
        log.info("afterDeleteEvent");
    }

}
