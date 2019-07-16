package io.github.futurewl.repository;

import io.github.futurewl.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface UserCrudRepository extends CrudRepository<User, Long> {

}
