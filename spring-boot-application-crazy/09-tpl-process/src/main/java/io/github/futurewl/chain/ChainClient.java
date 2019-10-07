package io.github.futurewl.chain;

public class ChainClient {

    // 维护第一任处理者的实例
    private IHandler firstHandler;

    public ChainClient(IHandler firstHandler) {
        this.firstHandler = firstHandler;
    }

    /**
     * 开始执行责任链
     */
    public void doChain() {
        // 先执行开始方法
        this.firstHandler.handlerStart();
        // 再执行tag方法
        this.firstHandler.handlerTag();
    }
}
