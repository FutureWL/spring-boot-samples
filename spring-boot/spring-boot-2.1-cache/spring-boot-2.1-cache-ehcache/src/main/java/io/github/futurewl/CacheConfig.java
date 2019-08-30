package io.github.futurewl;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableCaching // 启用缓存
public class CacheConfig {

    //    @Bean
    public CacheManager cacheManager() { // 声明缓存管理器
        return new ConcurrentMapCacheManager();
    }

//    @Bean
//    public EhCacheCacheManager cacheCacheManager(CacheManager cacheManager) {
//        return new EhCacheCacheManager(cacheManager);
//    }
//
//    @Bean
//    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
//        EhCacheManagerFactoryBean ehCacheManagerFactoryBean = new EhCacheManagerFactoryBean();
//        ehCacheManagerFactoryBean.setConfigLocation(new ClassPathResource("com/habuma/spitter/cache/ehcache.xml"));
//        return ehCacheManagerFactoryBean;
//    }

}
