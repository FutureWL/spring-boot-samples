package io.github.futurewl.v22.data.rest.handler;

import io.github.futurewl.v22.data.rest.entity.Device;
import io.github.futurewl.v22.data.rest.entity.Project3;
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
        log.info("HandleBeforeLinkSave");
    }

    @HandleAfterLinkSave
    public void afterLinkSaveEvent(Device device, PersistentBag persistentBag) {
        log.info("HandleAfterLinkSave");
    }

    @HandleBeforeLinkDelete
    public void beforeDeleteEventProject(Device device, PersistentBag persistentBag) {
        log.info("HandleBeforeLinkDelete");
    }

    @HandleAfterLinkDelete
    public void afterDeleteEventProject(Device device, PersistentBag persistentBag) {
        log.info("HandleAfterLinkDelete");
    }

    @HandleBeforeLinkDelete
    public void beforeDeleteEventProject0(Device device, Project3 project3) {
        log.info("HandleBeforeLinkDelete");
    }


}
