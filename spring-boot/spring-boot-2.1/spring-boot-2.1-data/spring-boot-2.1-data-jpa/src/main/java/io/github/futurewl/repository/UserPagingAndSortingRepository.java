package io.github.futurewl.repository;

import io.github.futurewl.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface UserPagingAndSortingRepository extends PagingAndSortingRepository<User, Long> {

}
