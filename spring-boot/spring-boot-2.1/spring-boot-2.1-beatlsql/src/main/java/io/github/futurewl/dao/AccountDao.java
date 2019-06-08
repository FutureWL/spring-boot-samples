package io.github.futurewl.dao;

import io.github.futurewl.entity.Account;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:13:45
 * @version 1.0
 */
public interface AccountDao extends BaseMapper<Account> {

    @SqlStatement(params = "name")
    Account selectAccountByName(String name);
}
