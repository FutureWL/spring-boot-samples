package io.github.futurewl;

import io.github.futurewl.entity.Person;
import org.springframework.web.client.RestTemplate;

/**
 * 在main方法中使用RestTemplate
 *
 * @author 杨恩雄
 */
public class RestTemplateMain {

    public static void main(String[] args) {
        RestTemplate tpl = new RestTemplate();
        Person p = tpl.getForObject("http://localhost:8080/person/angus", Person.class);
        System.out.println(p.getName() + "---" + p.getAge());
    }
}
