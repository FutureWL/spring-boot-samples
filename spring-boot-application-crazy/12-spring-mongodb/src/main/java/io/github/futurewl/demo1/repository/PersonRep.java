package io.github.futurewl.demo1.repository;

import io.github.futurewl.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PersonRep extends MongoRepository<Person, String>,
        PersonRepCustom {

    List<Person> name(String name);

    List<Person> findByAgeLessThan(Integer age);

    @Query("{ 'name' : ?0, 'age' : ?1 }")
    List<Person> findByNameAndAge(String name, Integer age);

    @Query(value = "{ 'name' : ?0 }", fields = "{ 'name' : 1, 'company' : 1}")
    List<Person> findByName(String name);
}
