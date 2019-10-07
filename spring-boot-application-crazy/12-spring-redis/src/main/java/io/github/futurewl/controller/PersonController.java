package io.github.futurewl.controller;

import io.github.futurewl.entity.Person;
import io.github.futurewl.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public List<Person> getPerson() {
        return personService.getPersons();
    }

    @RequestMapping(value = "/save/{name}", method = RequestMethod.GET)
    public String save(@PathVariable String name) {
        personService.save(name);
        return "Success";
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Person> query() {
        List<Person> persons = personService.myQuery();
        return persons;
    }

    @RequestMapping(value = "/top/{name}", method = RequestMethod.GET)
    public List<Person> findTop2ByName(@PathVariable String name) {
        return personService.findTop2ByName(name);
    }


    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public List<Person> findByName(@PathVariable String name) {
        System.out.println("=========" + name);
        List<Person> persons = personService.findByName(name);
        return persons;
    }
}
