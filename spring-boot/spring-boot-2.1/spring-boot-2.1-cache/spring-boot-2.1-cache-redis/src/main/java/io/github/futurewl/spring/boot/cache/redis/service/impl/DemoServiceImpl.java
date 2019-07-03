package io.github.futurewl.spring.boot.cache.redis.service.impl;

import io.github.futurewl.spring.boot.cache.redis.entity.Person;
import io.github.futurewl.spring.boot.cache.redis.repository.PersonRepository;
import io.github.futurewl.spring.boot.cache.redis.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:10:48
 * @version 1.0
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    PersonRepository repository;

    @Override
    @CachePut(value = "people", key = "#person.id")
    public Person save(Person person) {
        Person p = repository.save(person);
        System.out.println("为 id、key为：" + p.getId() + "数据做了缓存");
        return p;
    }

    @Override
    @CacheEvict(value = "peopele")
    public void remove(Long id) {
        System.out.println("删除了id、key为：" + id + "的数据缓存");
        repository.deleteById(id);
    }

    @Override
    @Cacheable(value = "people", key = "#person.id")
    public Person findOne(Person person) {
        Person p = repository.findById(person.getId()).orElse(null);
        assert p != null;
        System.out.println("为id、key为：" + p.getId() + "数据做缓存");
        return p;
    }
}
