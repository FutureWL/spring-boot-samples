package io.github.futurewl.an.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:17:43
 * @version 1.0
 */
public class Profile {

    @Autowired
    @Qualifier("student2")
    private Student student;

    public Profile() {
        System.out.println("Inside Profile constructor.");
    }

    public void printAge() {
        System.out.println("Age : " + student.getAge());
    }

    public void printName() {
        System.out.println("Name : " + student.getName());
    }

}
