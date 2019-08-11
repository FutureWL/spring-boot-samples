package io.github.futurewl.spring.boot.cache.concurrent.service;

import io.github.futurewl.spring.boot.cache.concurrent.entity.Person;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:10:48
 * @version 1.0
 */
public interface DemoService {
    Person save(Person person);

    void remove(Long id);

    Person findOne(Person person);
}
