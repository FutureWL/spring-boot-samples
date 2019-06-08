package io.github.futurewl.spring.boot.spring.boot.in.action.chapter3.repository;

import io.github.futurewl.spring.boot.spring.boot.in.action.chapter3.entity.Book;
import io.github.futurewl.spring.boot.spring.boot.in.action.chapter3.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-08:15:53
 * @version 1.0
 */
public interface ReadingListRepository extends JpaRepository<Book, String> {

    List<Book> findByReader(Reader reader);

}
