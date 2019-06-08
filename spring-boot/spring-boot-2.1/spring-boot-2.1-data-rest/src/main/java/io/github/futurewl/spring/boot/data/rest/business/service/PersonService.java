package io.github.futurewl.spring.boot.data.rest.business.service;

import io.github.futurewl.spring.boot.data.rest.business.entity.Person;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-10:23:54
 * @version 1.0
 */
public interface PersonService {

    void handlePersonCreateBefore(Person person);

    void handlePersonCreateAfter(Person person);

    void handlePersonSaveBefore(Person person);

    void handlePersonSaveAfter(Person person);
}
