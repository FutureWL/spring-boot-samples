package io.github.futurewl.business.repository;

import io.github.futurewl.business.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface CourseRepository extends JpaRepository<Course, Long> {
}
