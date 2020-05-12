package io.github.futurewl.stra;

import java.util.List;

/**
 * 策略客户端，不受策略改变的影响
 */
public class EventContext {

    // 维护多个策略接口
    private List<IEvent> events;

    public EventContext(List<IEvent> events) {
        this.events = events;
    }

    /**
     * 外部调用的处理方法
     */
    public void process() {
        // 执行具体的策略
        for (IEvent e : events) {
            e.handle();
        }
    }
}
