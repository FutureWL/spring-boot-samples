package io.github.futurewl.stra;

import io.github.futurewl.stra.impl.StartEvent;
import io.github.futurewl.stra.impl.TagEvent;

import java.util.ArrayList;
import java.util.List;

public class StraTest {

    public static void main(String[] args) {
        // 创建策略
        IEvent startEvent = new StartEvent();
        IEvent tagEvent = new TagEvent();
        List<IEvent> events = new ArrayList<IEvent>();
        events.add(startEvent);
        events.add(tagEvent);
        // 创建客户端，传入策略
        EventContext ctx = new EventContext(events);
        // 执行处理方法
        ctx.process();
    }
}
