package io.github.futurewl;

import org.springframework.stereotype.Service;

@Service
public class BaseHelloService {
    public String sayHello(String name) {
        return "Hello " + name + " !";
    }
}
