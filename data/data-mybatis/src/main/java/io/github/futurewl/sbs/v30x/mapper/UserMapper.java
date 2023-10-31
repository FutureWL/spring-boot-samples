package io.github.futurewl.sbs.v31x.mapper;

import io.github.futurewl.sbs.v31x.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // 指定这是一个操作数据库的 mapper
public interface UserMapper {

    List<User> findAll();

}
