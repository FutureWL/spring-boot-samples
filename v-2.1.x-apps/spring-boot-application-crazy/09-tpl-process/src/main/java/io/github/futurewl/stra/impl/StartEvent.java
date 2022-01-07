package io.github.futurewl.stra.impl;

import io.github.futurewl.stra.IEvent;

/**
 * 开始实现类
 */
public class StartEvent implements IEvent {

    public void handle() {
        System.out.println("处理开始事件");
    }
}
