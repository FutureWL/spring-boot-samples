package io.github.futurewl.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

/**
 * 功能描述：可选择的暴露 CRUD 方法
 *
 * @author weilai
 */
@NoRepositoryBean
public interface MyBaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
    T findOne(ID id);

    T save(T entity);
}
