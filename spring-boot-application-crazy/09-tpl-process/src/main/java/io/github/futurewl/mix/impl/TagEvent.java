package io.github.futurewl.mix.impl;

import io.github.futurewl.mix.IEvent;
import io.github.futurewl.mix.IHandler;


/**
 * 节点事件的实现类
 */
public class TagEvent implements IEvent {

    public void handle(IHandler handler) {
        System.out.println("策略实现类中处理节点事件");
        handler.handlerTag();
    }
}
