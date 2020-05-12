package io.github.futurewl.service;

import io.github.futurewl.entity.Person;
import io.github.futurewl.repository.PersonRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRep personRep;

    public List<Person> getPersons() {
        Iterable<Person> persons = personRep.findAll();
        List<Person> datas = new ArrayList<Person>();
        for (Iterator<Person> it = persons.iterator(); it.hasNext(); ) {
            Person p = it.next();
            datas.add(p);
        }
        return datas;
    }

    public List<Person> myQuery() {
        return personRep.myQuery();
    }

    public List<Person> findByName(String name) {
        return personRep.findByName(name);
    }

    public List<Person> findTop2ByName(String name) {
        return personRep.findTop2ByName(name);
    }

    public void save(String name) {
        Person p = new Person();
        p.setName(name);
        p.setAge(33);
        p.setCompany("crazyit");
        personRep.save(p);
    }
}
