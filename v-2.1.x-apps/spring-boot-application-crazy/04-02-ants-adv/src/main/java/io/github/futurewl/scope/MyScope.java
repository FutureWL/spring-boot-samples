package io.github.futurewl.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

public class MyScope implements Scope {

    // 记录bean的使用次数
    private Map<String, Integer> beanCounts = new HashMap<String, Integer>();

    // 保存实例
    private Map<String, Object> beans = new HashMap<String, Object>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if (beanCounts.get(name) == null) {
            beanCounts.put(name, 0);
        }
        // 第一次使用，放到实例的Map中
        Integer beanCount = beanCounts.get(name);
        // 当bean的使用次数为0时，会重新放置新的实例
        if (beanCount == 0) {
            Object newObject = objectFactory.getObject();
            beans.put(name, newObject);
        }
        Object bean = beans.get(name);
        // 计算器加1s
        Integer newBeanCount = beanCount + 1;
        // 使用次数超过4，设置为0
        if (newBeanCount >= 4) {
            newBeanCount = 0;
        }
        // 设置新的次数
        beanCounts.put(name, newBeanCount);
        //  返回实例
        return bean;
    }

    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        // TODO Auto-generated method stub

    }

    @Override
    public Object resolveContextualObject(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getConversationId() {
        // TODO Auto-generated method stub
        return null;
    }

}
