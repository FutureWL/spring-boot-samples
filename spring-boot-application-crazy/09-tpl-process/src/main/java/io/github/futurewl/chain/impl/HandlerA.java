package io.github.futurewl.chain.impl;

import io.github.futurewl.chain.IHandler;

public class HandlerA implements IHandler {

    private IHandler next;

    public void setNext(IHandler next) {
        this.next = next;
    }

    public void handlerStart() {
        // HandlerA只实现该方法，简单打印
        System.out.println("HandlerA handlerStart 方法");
        // 交给下一任处理者
        if (next != null) {
            next.handlerStart();
        }
    }

    public void handlerTag() {
        // HandlerA不实现方俯就地，直接交给下一任处理
        if (next != null) {
            next.handlerTag();
        }
    }
}
