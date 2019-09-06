package io.github.futurewl.demo2;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:21:08
 * @version 1.0
 */
public class StudentJDBCTemplate implements StudentDAO {

    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(String name, Integer age, Integer marks, Integer year) {
        try {
            String SQL1 = "insert into Student (name, age) values (?, ?)";
            jdbcTemplateObject.update(SQL1, name, age);
            // Get the latest student id to be used in Marks table
            String SQL2 = "select max(id) from Student";
            int sid = jdbcTemplateObject.queryForObject(SQL2, Integer.class);
            String SQL3 = "insert into Marks(sid, marks, year) values (?, ?, ?)";
            jdbcTemplateObject.update(SQL3, sid, marks, year);
            System.out.println("Created Name = " + name + ", Age = " + age);
            // to simulate the exception.
            throw new RuntimeException("simulate Error condition");
        } catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
            throw e;
        }
    }

    public List<StudentMarks> listStudents() {
        String SQL = "select * from Student, Marks where Student.id=Marks.sid";
        return jdbcTemplateObject.query(SQL, new StudentMarksMapper());
    }
}
