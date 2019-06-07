package io.github.futurewl.spring.boot.cache.concurrent.controller;

import io.github.futurewl.spring.boot.cache.concurrent.entity.Person;
import io.github.futurewl.spring.boot.cache.concurrent.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:10:54
 * @version 1.0
 */
@RestController
public class CacheController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/put")
    public Person put(Person person) {
        return demoService.save(person);
    }

    @RequestMapping("/able")
    public Person cacheable(Person person) {
        return demoService.findOne(person);
    }

    @RequestMapping("/evit")
    public String evit(Long id) {
        demoService.remove(id);
        return "ok";
    }

}
