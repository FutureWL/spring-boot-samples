package io.github.futurewl.spring.boot.web.sse;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-07-03:11:55
 * @version 1.0
 */
@Data
public class PayCompletedEvent extends ApplicationEvent {

    private Long payRecordId;

    public PayCompletedEvent(Object source, Long payRecordId) {
        super(source);
        this.payRecordId = payRecordId;
    }
}
