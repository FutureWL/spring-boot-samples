package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 功能描述：Redis 应用案例启动类
 *
 * @author weilai create by 2018-12-09:21:35
 * @version 1.0
 */
@EnableCaching
@SpringBootApplication
public class SpringBoot21CacheRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21CacheRedisApplication.class, args);
    }

}
