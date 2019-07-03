package io.github.futurewl.spring.boot.nosql.mongodb.repository;

import io.github.futurewl.spring.boot.nosql.mongodb.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:11:25
 * @version 1.0
 */
public interface PersonRepository extends MongoRepository<Person, String> {

    Person findByName(String name);

    @Query("{'age':?0}")
    List<Person> withQueryFindByAge(Integer age);

}
