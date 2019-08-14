package io.github.futurewl.repository;

import io.github.futurewl.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * 功能描述：
 *
 * @author weilai
 */
@CrossOrigin // 开启跨域
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
