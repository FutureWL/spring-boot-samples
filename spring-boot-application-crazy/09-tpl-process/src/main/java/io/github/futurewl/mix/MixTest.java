package io.github.futurewl.mix;

import io.github.futurewl.mix.impl.HandlerA;
import io.github.futurewl.mix.impl.HandlerB;
import io.github.futurewl.mix.impl.StartEvent;
import io.github.futurewl.mix.impl.TagEvent;

import java.util.ArrayList;
import java.util.List;

public class MixTest {

    public static void main(String[] args) {
        // 创建解析事件
        IEvent startEvent = new StartEvent();
        IEvent tagEvent = new TagEvent();
        List<IEvent> events = new ArrayList<IEvent>();
        events.add(startEvent);
        events.add(tagEvent);
        // 初始化责任链
        IHandler handlerA = new HandlerA();
        IHandler handlerB = new HandlerB();
        handlerA.setNext(handlerB);
        // 执行责任链
        EventContext ctx = new EventContext(events, handlerA);
        ctx.process();
    }
}
