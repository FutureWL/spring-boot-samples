package io.github.futurewl.demo2;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:20:57
 * @version 1.0
 */
public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private SimpleJdbcCall jdbcCall;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcCall = new SimpleJdbcCall(dataSource).
                withProcedureName("getRecord");
    }

    public void create(String name, Integer age) {
        JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
        String SQL = "insert into student (name, age) values (?, ?)";
        jdbcTemplateObject.update(SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }

    public Student getStudent(Integer id) {
        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
        Map<String, Object> out = jdbcCall.execute(in);
        Student student = new Student();
        student.setId(id);
        student.setName((String) out.get("out_name"));
        student.setAge((Integer) out.get("out_age"));
        return student;
    }

    public List<Student> listStudents() {
        JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
        String SQL = "select * from student";
        List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }
}
