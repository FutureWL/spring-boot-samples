package io.github.futurewl.feign;

import feign.Feign;
import feign.gson.GsonDecoder;
import io.github.futurewl.Person;

public class FeignMain {

    public static void main(String[] args) {
        // 调用Hello接口
        PersonClient pc =
                Feign.builder().decoder(new GsonDecoder()).target(PersonClient.class, "http://localhost:8080/");
        Person p = pc.getPerson("angus");
        System.out.println(p.getName() + "---" + p.getAge());
    }
}
