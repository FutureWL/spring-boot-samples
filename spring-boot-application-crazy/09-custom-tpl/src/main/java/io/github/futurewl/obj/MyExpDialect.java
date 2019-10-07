package io.github.futurewl.obj;

import org.thymeleaf.dialect.IExpressionObjectDialect;
import org.thymeleaf.expression.IExpressionObjectFactory;

/**
 * 自定义表达式对象方言类
 */
public class MyExpDialect implements IExpressionObjectDialect {

    public String getName() {
        return "My Exp Dialect";
    }

    /**
     * 返回对象工厂实例
     */
    public IExpressionObjectFactory getExpressionObjectFactory() {
        return new MyObjectFactory();
    }
}
