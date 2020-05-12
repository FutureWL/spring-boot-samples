package io.github.futurewl.stra.impl;

import io.github.futurewl.stra.IEvent;

/**
 * 节点事件的实现类
 */
public class TagEvent implements IEvent {

    public void handle() {
        System.out.println("处理节点事件");
    }
}
