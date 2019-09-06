package io.github.futurewl.demo2;

import javax.sql.DataSource;
import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:21:07
 * @version 1.0
 */
public interface StudentDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create
     * a record in the Student and Marks tables.
     */
    public void create(String name, Integer age, Integer marks, Integer year);

    /**
     * This is the method to be used to list down
     * all the records from the Student and Marks tables.
     */
    public List<StudentMarks> listStudents();
}
