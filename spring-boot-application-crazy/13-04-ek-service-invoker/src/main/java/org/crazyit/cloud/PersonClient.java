package org.crazyit.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//声明调用的服务名称
@FeignClient("service-provider")
public interface PersonClient {

    @RequestMapping(method = RequestMethod.GET, value = "/person/{personId}")
    Person findById(@PathVariable("personId") Integer personId);
}