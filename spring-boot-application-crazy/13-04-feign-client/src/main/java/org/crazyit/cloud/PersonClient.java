package org.crazyit.cloud;

import feign.Param;
import feign.RequestLine;
import lombok.Data;

/**
 * Person客户端服务类
 *
 * @author 杨恩雄
 */
public interface PersonClient {

    @RequestLine("GET /person/{personId}")
    Person findById(@Param("personId") Integer personId);

    // 为所有属性加上setter和getter等方法
    @Data
    class Person {
        Integer id;
        String name;
        Integer age;
    }
}
