package io.github.futurewl.repository;

import io.github.futurewl.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRep extends CrudRepository<Person, String>, PersonRepCustom {

    List<Person> findByName(String name);

    List<Person> findTop2ByName(String name);
}
