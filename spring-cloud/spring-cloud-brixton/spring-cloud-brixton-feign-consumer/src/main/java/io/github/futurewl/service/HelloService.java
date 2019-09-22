package io.github.futurewl.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:17:16
 * @version 1.0
 */
@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();
}
