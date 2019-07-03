package io.github.futurewl.spring.boot.web.sse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-07-03:11:41
 * @version 1.0
 */
@RestController
@SpringBootApplication
@RequestMapping("/sse")
public class SpringBoot21WebSSEApplication {


    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    PayCompletedListener payCompletedListener;

    @GetMapping("/push")
    public SseEmitter push(@RequestParam Long payRecordId) {
        final SseEmitter emitter = new SseEmitter();
        try {
            payCompletedListener.addSseEmitters(payRecordId, emitter);
        } catch (Exception e) {
            emitter.completeWithError(e);
        }

        return emitter;
    }

    @GetMapping("/pay-callback")
    public String payCallback(@RequestParam Long payRecordId) {
        applicationContext.publishEvent(new PayCompletedEvent(this, payRecordId));
        return "请到监听处查看消息";

    }

    @RequestMapping(value = "getdata", produces = "text/event-stream;charset=UTF-8")
    public String sse() {
        return Math.random() + "\n\n";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21WebSSEApplication.class, args);
    }

}
