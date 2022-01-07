package io.github.futurewl.demo1.repository.impl;

import io.github.futurewl.entity.Person;
import io.github.futurewl.demo1.repository.PersonRepCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonRepImpl implements PersonRepCustom {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public List<Person> myQuery() {
        List<Person> datas = stringRedisTemplate.execute(new RedisCallback<List<Person>>() {

            public List<Person> doInRedis(RedisConnection connection)
                    throws DataAccessException {
                List<Person> result = new ArrayList<Person>();
                StringRedisConnection conn = (StringRedisConnection) connection;
                // key都是以set类型保存的，先查询全部的key
                Set<String> dataKeys = conn.sMembers("Person");
                // 根据每个key去查询数据
                for (String dataKey : dataKeys) {
                    // key使用以下格式："Person:UUID"
                    String dataKeyStr = "Person:" + dataKey;
                    Map<String, String> data = conn.hGetAll(dataKeyStr);
                    // 读取数据，并转换为了Person
                    String age = new String(data.get("age"));
                    String name = new String(data.get("name"));
                    String company = new String(data.get("company"));
                    String id = new String(data.get("id"));
                    Person p = new Person();
                    p.setId(id);
                    p.setAge(Integer.parseInt(age));
                    p.setName(name);
                    p.setCompany(company);
                    result.add(p);
                }
                return result;
            }
        });
        return datas;
    }
}
