package io.github.futurewl.demo1.service;

import io.github.futurewl.dao.BookDao;
import io.github.futurewl.dao.BookStockDao;
import io.github.futurewl.entity.Book;
import io.github.futurewl.entity.BookStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BookStockService {

    @Autowired
    private BookStockDao bookStockDao;

    @Autowired
    private BookDao bookDao;

    /**
     * 为一本书创建库存数据
     */
    public BookStock createStock(Integer bookId) {
        BookStock stock = bookStockDao.findByBookId(bookId);
        Book book = bookDao.findById(bookId).get();
        // 没有才创建，保存一本书只有一条库存记录
        if (stock == null) {
            stock = new BookStock();
            stock.setBook(book);
            stock.setStockNum(new BigDecimal(0));
            BookStock newStock = bookStockDao.save(stock);
            return newStock;
        }
        return stock;
    }

    /**
     * 增加库存
     */
    public void addStock(Integer bookId, Integer amount) {
        // 更新库存
        BookStock stock = bookStockDao.findByBookId(bookId);
        if (stock == null) {
            stock = createStock(bookId);
        }
        // 新库存 = 旧库存 + 数量
        BigDecimal oldStock = stock.getStockNum();
        stock.setStockNum(oldStock.add(new BigDecimal(amount)));
        bookStockDao.save(stock);
    }

    /**
     * 减少存库
     */
    public void substractStock(Integer bookId, Integer amount) {
        // 更新库存
        BookStock stock = bookStockDao.findByBookId(bookId);
        if (stock == null) {
            stock = createStock(bookId);
        }
        // 新库存 = 旧库存 - 数量
        BigDecimal oldStock = stock.getStockNum();
        stock.setStockNum(oldStock.subtract(new BigDecimal(amount)));
        bookStockDao.save(stock);
    }

    /**
     * 查找首页的存库数据
     */
    public List<BookStock> findIndexStocks() {
        List<BookStock> stocks = bookStockDao.findTop10ByOrderByIdDesc();
        return stocks;
    }
}
