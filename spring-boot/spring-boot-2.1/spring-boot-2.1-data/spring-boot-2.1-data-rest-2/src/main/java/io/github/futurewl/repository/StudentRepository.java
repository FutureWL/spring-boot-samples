package io.github.futurewl.repository;

import io.github.futurewl.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface StudentRepository extends JpaRepository<Student    , Long> {
}
