package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 功能描述：CurrentCache 缓存管理技术
 *
 * @author weilai create by 2019-05-30:10:46
 * @version 1.0
 */
@EnableCaching
@SpringBootApplication
public class SpringBoot21CacheConcurrentCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21CacheConcurrentCacheApplication.class, args);
    }

}
