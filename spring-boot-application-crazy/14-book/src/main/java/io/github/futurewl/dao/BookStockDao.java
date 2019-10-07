package io.github.futurewl.dao;

import io.github.futurewl.entity.BookStock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookStockDao extends JpaRepository<BookStock, Integer> {

    BookStock findByBookId(Integer bookId);

    // 查询前10条存库数据，根据id排序
    List<BookStock> findTop10ByOrderByIdDesc();
}
