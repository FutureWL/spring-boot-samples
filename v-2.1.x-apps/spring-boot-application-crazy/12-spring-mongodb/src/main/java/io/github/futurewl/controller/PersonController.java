package io.github.futurewl.controller;

import io.github.futurewl.entity.Person;
import io.github.futurewl.demo1.service.PersonService;
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
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Person> myQuery() {
        List<Person> persons = personService.myQuery();
        return persons;
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public List<Person> findByName(@PathVariable String name) {
        List<Person> persons = personService.findByName(name);
        return persons;
    }

    @RequestMapping(value = "/ageless/{age}", method = RequestMethod.GET)
    public List<Person> findByAgeLessThan(@PathVariable Integer age) {
        List<Person> persons = personService.findByAgeLessThan(age);
        return persons;
    }

    @RequestMapping(value = "/nameage/{name}/{age}", method = RequestMethod.GET)
    public List<Person> findByNameAndAge(@PathVariable String name, @PathVariable Integer age) {
        List<Person> persons = personService.findByNameAndAge(name, age);
        return persons;
    }

    @RequestMapping(value = "/namewf/{name}", method = RequestMethod.GET)
    public List<Person> findByNameWithField(@PathVariable String name) {
        List<Person> persons = personService.findByNameWithField(name);
        return persons;
    }


    @RequestMapping(value = "/save/{name}", method = RequestMethod.GET)
    public String save(@PathVariable String name) {
        personService.save(name);
        return "Success";
    }
}
