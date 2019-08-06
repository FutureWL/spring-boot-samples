package io.github.futurewl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 * 功能描述：
 *
 * @author weilai
 */
@RestController
@SpringBootApplication
public class SpringBoot21SseApplication {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    PayCompletedListener payCompletedListener;

    @GetMapping("/push")
    public SseEmitter push(@RequestParam Long payRecordId) {
        final SseEmitter emitter = new SseEmitter();
        try {
            payCompletedListener.addSseEmitterMap(payRecordId, emitter);
        } catch (Exception e) {
            emitter.completeWithError(e);
        }
        return emitter;
    }

    @GetMapping("/pay-callback")
    public String payCallback(Long payRecordId) {
        applicationContext.publishEvent(new PayCompletedEvent(this, payRecordId));
        return "请到监听出查看消息";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21SseApplication.class, args);
    }
}
