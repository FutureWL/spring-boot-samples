package io.github.futurewl.spring.boot.webflux;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-22:00:28
 * @version 1.0
 */
public interface MyEventRepository extends ReactiveMongoRepository<MyEvent, Long> {
}
