package io.github.futurewl.service;

import io.github.futurewl.entity.Person;
import io.github.futurewl.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> getPersons() {
        List<Person> persons = personRepository.findAll();
        return persons;
    }

    public void save(String name) {
        Person p = new Person();
        p.setName(name);
        p.setAge(33);
        personRepository.save(p);
    }

    public List<Person> findByName(String name) {
        return personRepository.name(name);
    }

    public List<Person> findByNameAndAge(String name, Integer age) {
        return personRepository.findByNameAndAge(name, age);
    }

    public List<Person> findByAgeLessThan(Integer age) {
        return personRepository.findByAgeLessThan(age);
    }

    public List<Person> findPersonName(String name) {
        return personRepository.findPersonName(name);
    }

    public List<Person> findNativeByName(String name) {
        return personRepository.findNativeByName(name);
    }

    public List<Person> customQuery() {
        List<Person> persons = personRepository.myQuery();
        return persons;
    }
}
