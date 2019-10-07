package org.crazyit.cloud;

import feign.Feign;
import feign.gson.GsonDecoder;
import org.crazyit.cloud.PersonClient.Person;

/**
 * Person服务的运行主类
 *
 * @author 杨恩雄
 */
public class PersonMain {

    public static void main(String[] args) {
        PersonClient personClient = Feign.builder().decoder(new GsonDecoder())
                .target(PersonClient.class, "http://localhost:8080/");
        // 调用/person/{personId}服务
        Person person = personClient.findById(2);
        System.out
                .println(person.id + "---" + person.name + "---" + person.age);
    }
}
