package io.github.futurewl.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 销售明细
 *
 * @author 杨恩雄
 */
@Entity
@Table(name = "SALE_ITEM")
public class SaleItem extends BaseEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BOOK_ID")
    private Book book;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SALE_ID")
    private Sale sale;

    @Column
    private Integer amount;

    // 销售时的单价
    @Column
    private BigDecimal price;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
