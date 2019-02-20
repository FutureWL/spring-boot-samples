package io.github.futurewl.dao;

import io.github.futurewl.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-02-20:14:27
 * @version 1.0
 */
public interface AccountDao  extends JpaRepository<Account,Integer> {
}
