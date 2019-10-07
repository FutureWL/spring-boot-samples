package io.github.futurewl;

public class User {

    private String name;

    private Integer age;

    private String key;

    public User() {
        super();
    }

    public User(String key) {
        this.key = key;
    }

    public User(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", age: " + this.age;
    }

}
