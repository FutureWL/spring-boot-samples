package io.github.futurewl.spring.boot.data.rest.business.handler;

import io.github.futurewl.spring.boot.data.rest.business.entity.Person;
import io.github.futurewl.spring.boot.data.rest.business.service.PersonService;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

/**
 * 功能描述：用于指定对应的ENTITY操作的事件前后
 *
 * @author weilai create by 2019-05-11:08:46
 * @version 1.0
 */
@Component
@RepositoryEventHandler
public class PersonEventHandler {

    private final PersonService personService;

    public PersonEventHandler(PersonService personService) {
        this.personService = personService;
    }

    // 定义创建之前的动作
    @HandleBeforeCreate
    public void handleCountryCreateBefore(Person country) {
        personService.handlePersonCreateBefore(country);
    }

    // 定义创建之后的动作
    @HandleAfterCreate
    public void handleCountryCreateAfter(Person country) {
        personService.handlePersonCreateAfter(country);
    }

    // 定义save之前的动作
    @HandleBeforeSave
    public void handleCountrySaveBefore(Person country) {
        personService.handlePersonSaveBefore(country);
    }

    // 定义save之后的动作
    @HandleBeforeSave
    public void handleCountrySaveAfter(Person country) {
        personService.handlePersonSaveAfter(country);
    }


}