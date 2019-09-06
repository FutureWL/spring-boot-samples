package io.github.futurewl.demo2;

import javax.sql.DataSource;
import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:20:56
 * @version 1.0
 */
public interface StudentDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create
     * a record in the Student table.
     */
    void create(String name, Integer age);

    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
     */
    Student getStudent(Integer id);

    /**
     * This is the method to be used to list down
     * all the records from the Student table.
     */
    List<Student> listStudents();
}
