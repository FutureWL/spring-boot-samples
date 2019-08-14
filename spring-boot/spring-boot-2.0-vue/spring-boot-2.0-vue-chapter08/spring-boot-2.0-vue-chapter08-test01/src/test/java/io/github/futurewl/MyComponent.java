package io.github.futurewl;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    public MyComponent() {
        System.out.println(">>>MyComponent");
    }

    public String sayHello() {
        return "This is TestComponent!";
    }
}
