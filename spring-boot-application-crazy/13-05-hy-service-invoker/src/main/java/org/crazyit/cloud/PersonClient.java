package org.crazyit.cloud;

import org.crazyit.cloud.PersonClient.PersonClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//声明调用的服务名称
@FeignClient(name = "hy-service-provider", fallback = PersonClientFallback.class)
public interface PersonClient {

    @RequestMapping(method = RequestMethod.GET, value = "/person/{personId}")
    Person findById(@PathVariable("personId") Integer personId);

    @Component
    static class PersonClientFallback implements PersonClient {

        @Override
        public Person findById(Integer personId) {
            // 回退方法
            System.out.println("执行 findByid 的回退方法，返回一个预先设定好的 Person");
            Person p = new Person(-1, "模拟Person", 0);
            return p;
        }
    }
}