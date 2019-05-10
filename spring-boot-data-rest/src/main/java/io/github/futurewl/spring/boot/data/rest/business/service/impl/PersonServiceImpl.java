package io.github.futurewl.spring.boot.data.rest.business.service.impl;

import io.github.futurewl.spring.boot.data.rest.business.entity.Person;
import io.github.futurewl.spring.boot.data.rest.business.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-10:23:54
 * @version 1.0
 */
@Service
public class PersonServiceImpl implements PersonService {

    public void handlePersonCreateBefore(Person person) {
        System.out.println("创建 person 之前：" + person);
    }

    public void handlePersonCreateAfter(Person person) {
        System.out.println("创建 person 之后：" + person);
    }

    public void handlePersonSaveBefore(Person person) {
        System.out.println("Save person 之前：" + person);
    }

    public void handlePersonSaveAfter(Person person) {
        System.out.println("Save person 之后：" + person);
    }

}
