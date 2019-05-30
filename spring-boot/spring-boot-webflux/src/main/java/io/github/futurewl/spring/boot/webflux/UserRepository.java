package io.github.futurewl.spring.boot.webflux;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-22:00:00
 * @version 1.0
 */
public interface UserRepository extends ReactiveCrudRepository<User, String> {

    Mono<User> findByUsername(String username);

    Mono<Long> deleteByUsername(String username);

}
