package io.github.futurewl.spring.boot.webflux.myevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-22:00:28
 * @version 1.0
 */
@RestController
@RequestMapping("/events")
public class MyEventController {

    @Autowired
    private MyEventRepository myEventRepository;

    @PostMapping(path = "")
    public Mono<Void> loadEvents(@RequestBody Flux<MyEvent> events) {   // 1
        return this.myEventRepository.insert(events).then();
    }

    @GetMapping(path = "", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<MyEvent> getEvents() {  // 2
        // TODO
        return null;
    }
}
