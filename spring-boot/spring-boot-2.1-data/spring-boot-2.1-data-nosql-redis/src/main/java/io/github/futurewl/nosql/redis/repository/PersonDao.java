package io.github.futurewl.nosql.redis.repository;

import io.github.futurewl.nosql.redis.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:12:32
 * @version 1.0
 */
@Repository
public class PersonDao {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Resource(name = "stringRedisTemplate")
    ValueOperations<String, String> valueOperationsString;

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Resource(name = "redisTemplate")
    ValueOperations<Object, Object> valueOperationsObject;

    public void stringRedisTemplateDemo() {
        valueOperationsString.set("xxx", "yyy");
    }

    public void save(Person person) {
        valueOperationsObject.set(person.getId(), person);
    }

    public String getString() {
        return valueOperationsString.get("xxx");
    }

    public Person getPerson() {
        return (Person) valueOperationsObject.get("1");
    }

}
