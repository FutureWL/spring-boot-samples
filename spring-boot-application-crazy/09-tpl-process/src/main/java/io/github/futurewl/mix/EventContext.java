package io.github.futurewl.mix;

import java.util.List;

/**
 * 策略客户端，不受策略改变的影响
 */
public class EventContext {

    // 维护多个策略接口
    private List<IEvent> events;

    private IHandler firstHandler;

    public EventContext(List<IEvent> events, IHandler firstHandler) {
        this.events = events;
        this.firstHandler = firstHandler;
    }

    /**
     * 外部调用的处理方法
     */
    public void process() {
        // 执行具体的策略
        for (IEvent e : events) {
            e.handle(firstHandler);
        }
    }
}
