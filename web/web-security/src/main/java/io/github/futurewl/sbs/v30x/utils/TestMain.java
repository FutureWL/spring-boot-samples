package io.github.futurewl.sbs.v31x.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
