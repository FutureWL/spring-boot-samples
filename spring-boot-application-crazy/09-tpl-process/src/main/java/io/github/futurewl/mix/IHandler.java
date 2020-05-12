package io.github.futurewl.mix;

/**
 * 处理者接口
 */
public interface IHandler {

    /**
     * 设置下一任处理者
     */
    void setNext(IHandler next);

    void handlerStart();

    void handlerTag();
}
