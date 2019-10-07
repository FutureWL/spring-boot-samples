package io.github.futurewl.service;

import org.springframework.stereotype.Service;

@Service
public class RemoteService {

    public String call() {
        return "hello";
    }
}
