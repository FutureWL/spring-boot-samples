package io.github.futurewl.stra;

/**
 * 事件接口，也是策略接口
 *
 * @author 杨恩雄
 */
public interface IEvent {

    /**
     * 策略接口定义的处理方法
     */
    void handle();
}
