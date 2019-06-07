package io.github.futurewl.dao;


import io.github.futurewl.entity.Account;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:13:45
 * @version 1.0
 */
public interface IAccountDAO {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
