package io.github.futurewl.spring.boot.spring.boot.in.action.chapter1;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:12:16
 * @version 1.0
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);

}
