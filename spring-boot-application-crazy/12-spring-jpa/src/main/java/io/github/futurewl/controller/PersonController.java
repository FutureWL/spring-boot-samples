package io.github.futurewl.controller;

import io.github.futurewl.entity.Person;
import io.github.futurewl.demo1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/persons", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @GetMapping(value = "/query", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> query() {
        return personService.customQuery();
    }

    @GetMapping(value = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findByName(@PathVariable String name) {
        return personService.findByName(name);
    }

    @GetMapping(value = "/nameage/{name}/{age}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findByName(@PathVariable String name, @PathVariable Integer age) {
        return personService.findByNameAndAge(name, age);
    }

    @GetMapping(value = "/ageless/{age}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> ageless(@PathVariable Integer age) {
        return personService.findByAgeLessThan(age);
    }

    @GetMapping(value = "/findPersonName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findPersonName(@PathVariable String name) {
        return personService.findPersonName(name);
    }

    @GetMapping(value = "/native/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findNativeByName(@PathVariable String name) {
        return personService.findNativeByName(name);
    }

    // 为简单起见使用GET方法，应使用POST
    @GetMapping(value = "/save/{name}")
    public String save(@PathVariable String name) {
        personService.save(name);
        return "SUCCESS";
    }
}
