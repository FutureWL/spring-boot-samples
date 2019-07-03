package io.github.futurewl.spring.boot.web.sse;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-07-03:11:55
 * @version 1.0
 */
@Component
public class PayCompletedListener {
    private static Map<Long, SseEmitter> sseEmitters = new Hashtable<>();

    public void addSseEmitters(Long payRecordId, SseEmitter sseEmitter) {
        sseEmitters.put(payRecordId, sseEmitter);
    }

    @EventListener
    public void deployEventHandler(PayCompletedEvent payCompletedEvent) throws IOException {
        Long payRecordId = payCompletedEvent.getPayRecordId();
        SseEmitter sseEmitter = sseEmitters.get(payRecordId);
        sseEmitter.send("支付成功");
        sseEmitter.complete();

    }
}
