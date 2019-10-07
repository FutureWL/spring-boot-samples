package io.github.futurewl.service;

import io.github.futurewl.dao.BookDao;
import io.github.futurewl.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public Book findById(Integer bookId) {
        return bookDao.findById(bookId).get();
    }

    public void save(Book book) {
        bookDao.save(book);
    }


    public Page<Book> findAll(Pageable pageable) {
        Example<Book> example = getNotDeleteExample();
        return bookDao.findAll(example, pageable);
    }

    /**
     * 返回一个设置了 isDelete 为 false 的Example
     *
     * @return
     */
    private Example<Book> getNotDeleteExample() {
        // 只查询没有删除的图书
        Book book = new Book();
        book.setIsDelete(false);
        return Example.of(book);
    }

    public void delete(Integer[] ids) {
        for (Integer id : ids) {
            Book book = findById(id);
            book.setIsDelete(true);
            save(book);
        }
    }

    public Page<Book> testFindAll(Pageable pageable) {
        return bookDao.findAll(pageable);
    }

    /**
     * 查找首页书本数据
     */
    public List<Book> findIndexBooks() {
        return bookDao.findTop3ByIsDeleteOrderByIdDesc(false);
    }
}
