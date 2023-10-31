package io.github.futurewl.sbs.v31x;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void init() {
        log.info(name + ":init");
    }

    public void destroy() {
        log.info(name + "person:destroy");
    }

}
