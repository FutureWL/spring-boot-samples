package io.github.futurewl.chain;

import io.github.futurewl.chain.impl.HandlerA;
import io.github.futurewl.chain.impl.HandlerB;

public class ChainTest {

    public static void main(String[] args) {
        // 初始化责任链
        IHandler first = new HandlerA();
        IHandler second = new HandlerB();
        // 为第一个处理者设置下一任处理者
        first.setNext(second);
        // 创建客户端实例，并设置第一任处理者
        ChainClient chain = new ChainClient(first);
        // 执行责任链
        chain.doChain();
    }
}
