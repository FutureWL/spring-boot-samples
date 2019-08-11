package io.github.futurewl;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author weilai
 */
@Component
public class PayCompletedListener {

    private static Map<Long, SseEmitter> sseEmitterMap = new HashMap<>();

    public void addSseEmitterMap(Long payRecordId, SseEmitter sseEmitter) {
        sseEmitterMap.put(payRecordId, sseEmitter);
    }

    @EventListener
    public void deployEventHandler(PayCompletedEvent payCompletedEvent) throws IOException {
        Long payRecordId = payCompletedEvent.getPayRecordId();
        SseEmitter sseEmitter = sseEmitterMap.get(payRecordId);
        sseEmitter.send("支付成功");
    }

    public void end(Long payRecordId){
        SseEmitter sseEmitter = sseEmitterMap.get(payRecordId);
        sseEmitter.complete();
    }

}
