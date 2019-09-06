package io.github.futurewl.repository;

import io.github.futurewl.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-30:10:47
 * @version 1.0
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
