package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.cache.ICache;
import org.thymeleaf.cache.StandardCacheManager;
import org.thymeleaf.cache.TemplateCacheKey;
import org.thymeleaf.context.Context;
import org.thymeleaf.engine.TemplateModel;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class CacheConfigTest {

    public static void main(String[] args) throws Exception {
        // 模板引擎
        TemplateEngine templateEngine = new TemplateEngine();
        // 模板处理喊叫
        ClassLoaderTemplateResolver resolover = new ClassLoaderTemplateResolver();
        // 关闭全局缓存，默认值为true
        resolover.setCacheable(false);
        // 设置缓存仅对该页面生效
        resolover.getCacheablePatternSpec().addPattern("cacheConfig.html");
        // 缓存管理器
        StandardCacheManager cacheManager = new StandardCacheManager();
        // 设置模板缓存的最大数量
        cacheManager.setTemplateCacheMaxSize(10);
        // 设置表达式缓存的最大数量
        cacheManager.setExpressionCacheMaxSize(10);

        // 为模板引用设置解析器以及缓存管理器
        templateEngine.setTemplateResolver(resolover);
        templateEngine.setCacheManager(cacheManager);

        Context ctx = new Context();
        ctx.setVariable("user", "Angus");
        String result = templateEngine.process("cacheConfig.html", ctx);
        // 该模板不会有缓存
        templateEngine.process("cacheConfig2.html", ctx);
        // 打印缓存
        printTplCache(cacheManager);
    }

    static void printTplCache(StandardCacheManager cacheManager) {
        ICache<TemplateCacheKey, TemplateModel> caches = cacheManager.getTemplateCache();
        for (TemplateCacheKey key : caches.keySet()) {
            TemplateModel model = caches.get(key);
            System.out.println(key.getTemplate() + "---" + model);
        }
    }
}
