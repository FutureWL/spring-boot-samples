package io.github.futurewl.obj;

import org.thymeleaf.context.IExpressionContext;
import org.thymeleaf.expression.IExpressionObjectFactory;

import java.util.HashSet;
import java.util.Set;

public class MyObjectFactory implements IExpressionObjectFactory {

    /**
     * 返回表达式对象的名称
     */
    public Set<String> getAllExpressionObjectNames() {
        Set<String> names = new HashSet<String>();
        names.add("crazy");
        return names;
    }

    /**
     * 创建内置对象对应的实例
     */
    public Object buildObject(IExpressionContext context,
                              String expressionObjectName) {
        if ("crazy".equals(expressionObjectName)) {
            return new CrazyUtil();
        }
        return null;
    }

    /**
     * 是否缓存该对象
     */
    public boolean isCacheable(String expressionObjectName) {
        return false;
    }
}
