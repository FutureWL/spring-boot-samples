package io.github.futurewl.business.repository;

import io.github.futurewl.business.entity.Course;
import io.github.futurewl.business.entity.Student;
import io.github.futurewl.business.entity.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述：
 *
 * @author weilai
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void create() {
        Student student = new Student();
        student.setName("小明");

        Course course = new Course();
        course.setName("语文课");

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student);

        course.setStudentList(studentSet);

        Teacher teacher = new Teacher();
        teacher.setName("语文老师");
        teacher.setCourse(course);

        student.setCourse(course);

//        studentRepository.save(student);
        teacherRepository.save(teacher);
//        courseRepository.save(course);
    }

}
