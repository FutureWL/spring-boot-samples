package io.github.futurewl.sbs.v31x.dao;

import io.github.futurewl.sbs.v31x.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SysUserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 保存用户
     *
     * @param user
     */
    public void save(SysUser user) {
        String sql = "insert into sys_user(id, name, nick_name, password, email) values(?,?,?,?,?)";
        jdbcTemplate.update(sql, user.getId(), user.getName(), user.getNickName(), user.getPassword(), user.getEmail());
    }

    /**
     * 删除用户
     *
     * @param id
     */
    public void delete(String id) {
        String sql = "delete from sys_user where id=?";
        jdbcTemplate.update(sql, id);
    }

    /**
     * 查询全部用户
     *
     * @return
     */
    public List<SysUser> findAll() {
        String sql = "select * from sys_user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysUser.class));
    }

}
