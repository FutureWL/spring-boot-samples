package io.github.futurewl.service;

import io.github.futurewl.dao.AccountMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:14:27
 * @version 1.0
 */
@Service
public class AccountService2 {

    private final AccountMapper2 accountMapper2;

    @Autowired
    public AccountService2(AccountMapper2 accountMapper2) {
        this.accountMapper2 = accountMapper2;
    }

    @Transactional
    public void transfer() throws RuntimeException {
        //用户1减10块 用户2加10块
        accountMapper2.update(90, 1);
        int i = 1 / 0;
        accountMapper2.update(110, 2);
    }

}