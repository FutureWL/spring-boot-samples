package io.github.futurewl;

import org.springframework.context.ApplicationEvent;

/**
 * 功能描述：
 *
 * @author weilai
 */
public class PayCompletedEvent extends ApplicationEvent {

    private Long payRecordId;

    public PayCompletedEvent(Object source, Long payRecordId) {
        super(source);
        this.payRecordId = payRecordId;
    }

    public Long getPayRecordId() {
        return payRecordId;
    }

    public void setPayRecordId(Long payRecordId) {
        this.payRecordId = payRecordId;
    }
}
