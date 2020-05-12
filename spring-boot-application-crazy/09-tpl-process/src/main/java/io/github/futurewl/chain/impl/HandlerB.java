package io.github.futurewl.chain.impl;

import io.github.futurewl.chain.IHandler;

public class HandlerB implements IHandler {

    private IHandler next;

    public void setNext(IHandler next) {
        this.next = next;
    }

    public void handlerStart() {
        // HandlerB不实现该方法，直接交给下一任处理
        if (next != null) {
            next.handlerStart();
        }
    }

    public void handlerTag() {
        // HandlerB实现该方法方法，简单控制台输出
        System.out.println("HandlerB handlerTag 方法");
        // 交给下一任处理
        if (next != null) {
            next.handlerTag();
        }
    }
}
