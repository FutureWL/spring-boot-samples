package io.github.futurewl.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:14:27
 * @version 1.0
 */
@Mapper
public interface AccountMapper2 {

    /**
     * 更新数据
     *
     * @param money
     * @param id
     * @return
     */
    int update(@Param("money") double money,
               @Param("id") int id);

}