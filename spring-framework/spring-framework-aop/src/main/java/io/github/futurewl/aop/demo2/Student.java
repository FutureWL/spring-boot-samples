package io.github.futurewl.aop.demo2;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:19:44
 * @version 1.0
 */
public class Student {

    private Integer age;

    private String name;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        System.out.println("Age : " + age);
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Name : " + name);
        return name;
    }

    public void printThrowException() {
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
