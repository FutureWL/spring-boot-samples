package io.github.futurewl.demo1.repository;

import io.github.futurewl.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer>,
        PersonRepositoryCustom {

    List<Person> name(String name);

    List<Person> findByNameAndAge(String name, Integer age);

    List<Person> findByAgeLessThan(Integer age);

    @Query("select p from Person p where p.name = ?1")
    List<Person> findPersonName(String name);

    @Query(value = "SELECT * FROM CRA_PERSON WHERE NAME = ?1", nativeQuery = true)
    List<Person> findNativeByName(String name);
}
