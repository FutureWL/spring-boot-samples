package io.github.futurewl.service;

import io.github.futurewl.entity.Person;
import io.github.futurewl.repository.PersonRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRep personRep;

    public List<Person> getPersons() {
        List<Person> datas = personRep.findAll();
        return datas;
    }

    public List<Person> myQuery() {
        List<Person> persons = personRep.myQuery();
        return persons;
    }

    public List<Person> findByName(String name) {
        List<Person> persons = personRep.name(name);
        return persons;
    }

    public List<Person> findByNameAndAge(String name, Integer age) {
        List<Person> persons = personRep.findByNameAndAge(name, age);
        return persons;
    }

    public List<Person> findByAgeLessThan(Integer age) {
        return personRep.findByAgeLessThan(age);
    }

    public List<Person> findByNameWithField(String name) {
        return personRep.findByName(name);
    }

    public void save(String name) {
        Person p = new Person();
        p.setName(name);
        p.setAge(33);
        p.setCompany("ce");
        personRep.save(p);
    }
}
