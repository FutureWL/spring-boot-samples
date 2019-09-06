package io.github.futurewl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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


    private static Map<String, SseEmitter> stringSseEmitterMap = new HashMap<>();

    @GetMapping(value = "/push")
    public SseEmitter push(@RequestParam Long payRecordId) {
        final SseEmitter emitter = new SseEmitter(0L);
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

    @GetMapping("/end")
    public void end(Long payRecordId) {
        payCompletedListener.end(payRecordId);
    }


    @GetMapping(value = "/getData", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public void getDate(HttpServletResponse response) throws IOException, InterruptedException {
        response.setContentType("text/event-stream");
        response.setCharacterEncoding("UTF-8");
        response.setStatus(200);
        while (!response.getWriter().checkError()) {
            response.getWriter().write("data:" + new Date() + "\n\n");
            response.getWriter().flush();
            Thread.sleep(1000);
        }
        response.getWriter().close();
    }

    @GetMapping(value = "/getData2")
    public SseEmitter getDate2() {
        final SseEmitter emitter = new SseEmitter();
        new Thread(() -> {
            try {
                int time = 0;
                while (true) {
                    emitter.send(System.currentTimeMillis());
                    Thread.sleep(1000L);
//                    if (time == 3) {
//                        emitter.send(SseEmitter.event().name("finish").id("666").data("HaHa"));
//                        emitter.complete();
//                        break;
//                    }
//                    time++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        stringSseEmitterMap.put("sse", emitter);
        return emitter;
    }

    @GetMapping("/close")
    public void close() {
        stringSseEmitterMap.get("sse").complete();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21SseApplication.class, args);
    }
}
