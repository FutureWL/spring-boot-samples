package io.github.futurewl;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JetisTest {

    public static void main(String[] args) {
        // 登录本地的Redis
        Jedis jedis = new Jedis("localhost");
        jedis.auth("123456");
        // 将数据保存为hash类型
        Map<String, String> data = new HashMap<String, String>();
        data.put("name", "Angus");
        data.put("age", "33");
        data.put("company", "crazyit");
        jedis.hmset("person_test", data);
        // 查询hash类型的数据
        List<String> dbDatas = jedis.hmget("person_test", "name", "age");
        for (String dbData : dbDatas) {
            System.out.println(dbData);
        }
        /* =========分隔线==========  */
        // 将数据保存为set类型
        jedis.sadd("person_test_ids", "1", "2");
        // 查询数据
        Set<String> dbDatasSet = jedis.smembers("person_test_ids");
        for (String dbData : dbDatasSet) {
            System.out.println(dbData);
        }
    }
}
