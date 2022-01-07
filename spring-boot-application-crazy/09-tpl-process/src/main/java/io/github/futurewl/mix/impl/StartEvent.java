package io.github.futurewl.mix.impl;

import io.github.futurewl.mix.IEvent;
import io.github.futurewl.mix.IHandler;


/**
 * 开始实现类
 */
public class StartEvent implements IEvent {

    public void handle(IHandler handler) {
        System.out.println("策略实现类中处理开始事件");
        // 执行Handler的start方法
        handler.handlerStart();
    }
}
