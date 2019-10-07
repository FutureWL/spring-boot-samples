package io.github.futurewl;

import org.thymeleaf.context.IExpressionContext;
import org.thymeleaf.standard.expression.IStandardConversionService;

public class MyConverService implements IStandardConversionService {

    public String convert(IExpressionContext context, Object object,
                          Class targetClass) {
        // 只处理用户对象
        if (object instanceof User) {
            // 强制转换为User对象
            User u = (User) object;
            // 只返回名称
            return "name: " + u.getName();
        }
        return object.toString();
    }
}
