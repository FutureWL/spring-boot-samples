package io.github.futurewl.repository;

import io.github.futurewl.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * 功能描述：
 *
 * @author weilai
 */
@RepositoryRestResource(
//        exported = false, // 移除所有增删改查方法
        path = "bs",
        collectionResourceRel = "bs",
        itemResourceRel = "b"
)
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Override
    @RestResource(
//            exported = false // 移除单个方法
    )
    void deleteById(Integer integer);
}
