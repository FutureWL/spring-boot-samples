package io.github.futurewl.spring.boot.nosql.mongodb.controller;

import io.github.futurewl.spring.boot.nosql.mongodb.entity.Location;
import io.github.futurewl.spring.boot.nosql.mongodb.entity.Person;
import io.github.futurewl.spring.boot.nosql.mongodb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:11:36
 * @version 1.0
 */
@RestController
public class DataController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/save")
    public Person save() {
        Person person = new Person("wfy", 123);
        Collection<Location> locations = new LinkedHashSet<>();
        Location location1 = new Location("上海", "2009");
        Location location2 = new Location("北京", "2010");
        Location location3 = new Location("南京", "2011");
        Location location4 = new Location("广州", "2012");

        locations.add(location1);
        locations.add(location2);
        locations.add(location3);
        locations.add(location4);

        person.setLocations(locations);

        return personRepository.save(person);
    }

    @RequestMapping("/q1")
    public Person q1(String name) {
        return personRepository.findByName(name);
    }

    @RequestMapping("/q2")
    public List<Person> q2(Integer age) {
        return personRepository.withQueryFindByAge(age);
    }

}
