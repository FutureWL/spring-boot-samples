package io.github.futurewl.spring.boot.webflux;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-22:00:01
 * @version 1.0
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<User> save(User user) {
        return userRepository.save(user).onErrorResume(e ->
                userRepository.findByUsername(user.getUsername()).flatMap(originalUser -> {
                    user.setId(originalUser.getId());
                    return userRepository.save(user);
                }));
    }

    public Mono<Long> deleteByUsername(String username) {
        return userRepository.deleteByUsername(username);
    }

    public Mono<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Flux<User> findAll() {
        return userRepository.findAll();
    }

}
