package io.github.futurewl.demo1.service;

import io.github.futurewl.dao.BookDao;
import io.github.futurewl.dao.SaleDao;
import io.github.futurewl.dao.SaleItemDao;
import io.github.futurewl.entity.Book;
import io.github.futurewl.entity.Sale;
import io.github.futurewl.entity.SaleItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleDao saleDao;

    @Autowired
    private SaleItemDao saleItemDao;

    @Autowired
    private BookDao bookDao;

    @Autowired
    private BookStockService bookStockService;

    /**
     * 分页查询数据
     */
    public Page<Sale> findAll(Pageable pageable) {
        Page<Sale> datas = saleDao.findAll(pageable);
        // 设置明细的书本名称
        List<Sale> sales = datas.getContent();
        for (Sale s : sales) {
            List<SaleItem> items = saleItemDao.findBySaleId(s.getId());
            s.initBookNames(items);
            s.initMoney(items);
        }
        return datas;
    }

    /**
     * 创建销售单
     */
    @Transactional
    public void save(List<SaleItem> items) {
        // 保存销售单
        Sale sale = new Sale();
        sale.setCreateTime(new Date());
        saleDao.save(sale);
        // 保存明细
        for (int i = 0; i < items.size(); i++) {
            SaleItem item = items.get(i);
            // 查询 Book 对象
            Book book = bookDao.findById(item.getBook().getId()).get();
            item.setSale(sale);
            item.setBook(book);
            item.setPrice(book.getPrice());
            saleItemDao.save(item);
            // 更新库存
            bookStockService.substractStock(book.getId(), item.getAmount());
        }
    }

    /**
     * 根据id查询Sale
     */
    public Sale findById(Integer saleId) {
        return saleDao.findById(saleId).get();
    }

    /**
     * 根据id查询销售单明细
     */
    public List<SaleItem> findBySaleId(Integer saleId) {
        return saleItemDao.findBySaleId(saleId);
    }
}
