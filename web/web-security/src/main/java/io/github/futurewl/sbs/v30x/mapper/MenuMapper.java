package io.github.futurewl.sbs.v31x.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.futurewl.sbs.v31x.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long id);
}
