package io.github.futurewl.demo2;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:21:07
 * @version 1.0
 */
public class StudentMarksMapper implements RowMapper<StudentMarks> {
    public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.setId(rs.getInt("id"));
        studentMarks.setName(rs.getString("name"));
        studentMarks.setAge(rs.getInt("age"));
        studentMarks.setSid(rs.getInt("sid"));
        studentMarks.setMarks(rs.getInt("marks"));
        studentMarks.setYear(rs.getInt("year"));
        return studentMarks;
    }
}
