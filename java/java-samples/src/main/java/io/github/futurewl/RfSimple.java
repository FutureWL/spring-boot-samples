package io.github.futurewl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class RfSimple {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Person.class;
        if (Objects.nonNull(clazz)) {
            Constructor constructor = clazz.getConstructor();
            Person p = (Person) constructor.newInstance();
            p.setName("Hello");
            System.out.println(p.getName());
        }
    }
}


class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
