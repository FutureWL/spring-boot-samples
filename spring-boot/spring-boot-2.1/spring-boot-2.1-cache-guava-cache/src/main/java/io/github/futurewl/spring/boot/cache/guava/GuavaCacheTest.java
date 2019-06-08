package io.github.futurewl.spring.boot.cache.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * 功能描述：
 *
 * @author weilai create by 2018-12-09:22:21
 * @version 1.0
 */
public class GuavaCacheTest {
    public static void main(String[] args) {
        LoadingCache<String, String> userCache = CacheBuilder.newBuilder()
                // 缓存 20 分钟
                .expireAfterWrite(20, TimeUnit.MINUTES)
                // 最多缓存 1000 个对象
                .maximumSize(1000)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String s) throws Exception {
                        return "b";
                    }
                });
        try {
            System.out.println(userCache.get("a"));
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
