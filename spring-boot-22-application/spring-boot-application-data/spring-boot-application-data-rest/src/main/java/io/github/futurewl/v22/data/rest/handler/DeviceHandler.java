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
public class DeviceHandler {

    @HandleBeforeCreate
    public void beforeCreateEvent(Device device) {
        log.info("beforeCreateEvent");
    }

    @HandleAfterCreate
    public void afterCreateEvent(Device device) {
        log.info("afterCreateEvent");
    }

    @HandleBeforeSave
    public void beforeSaveEvent(Device device) {
        log.info("beforeSaveEvent");
    }

    @HandleAfterSave
    public void afterSaveEvent(Device device) {
        log.info("afterSaveEvent");
    }

    @HandleBeforeLinkSave
    public void beforeLinkSaveEvent(Device device, PersistentBag persistentBag) {
        log.info(persistentBag.get(0).getClass().getName());
        log.info("beforeLinkSaveEvent");
    }

    @HandleAfterLinkSave
    public void afterLinkSaveEvent(Device device, PersistentBag persistentBag) {
        log.info("afterLinkSaveEvent");
    }

    @HandleBeforeLinkDelete
    public void beforeDeleteEvent(Device device, DeviceLoop deviceLoop) {
        log.info("beforeDeleteEvent");
    }

    @HandleAfterLinkDelete
    public void afterDeleteEvent(Device device, DeviceLoop deviceLoop) {
        log.info("afterDeleteEvent");
    }

}
