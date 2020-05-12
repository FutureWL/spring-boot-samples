package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.cache.ICache;
import org.thymeleaf.cache.ICacheManager;
import org.thymeleaf.cache.TemplateCacheKey;
import org.thymeleaf.context.Context;
import org.thymeleaf.engine.TemplateModel;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class CacheTest {

    public static void main(String[] args) throws Exception {
        // 模板引擎
        TemplateEngine templateEngine = new TemplateEngine();
        // 模板处理喊叫
        ClassLoaderTemplateResolver resolover = new ClassLoaderTemplateResolver();
        // 设置缓存存活时间为500毫秒
        resolover.setCacheTTLMs(500L);
        templateEngine.setTemplateResolver(resolover);
        // 获取默认的缓存管理器
        ICacheManager cacheManager = templateEngine.getCacheManager();
        Context ctx = new Context();
        String result = templateEngine.process("cache.html", ctx);
        // 输出5次缓存
        for (int i = 0; i < 5; i++) {
            printTplCache(cacheManager);
            // 输出完第一次后，让缓存超时
            if (i == 0) {
                Thread.sleep(1000);
            }
        }
    }

    /*
     * 打印模板缓存
     */
    static void printTplCache(ICacheManager cacheManager) {
        ICache<TemplateCacheKey, TemplateModel> caches = cacheManager.getTemplateCache();
        for (TemplateCacheKey key : caches.keySet()) {
            // 缓存的get方法，会判断是否超时，是的话则会删除缓存
            TemplateModel model = caches.get(key);
        }
        System.out.println("缓存数量：" + caches.keySet().size());
    }
}
