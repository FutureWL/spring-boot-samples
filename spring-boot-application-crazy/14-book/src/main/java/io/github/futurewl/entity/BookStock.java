package io.github.futurewl.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BOOK_STOCK")
public class BookStock extends BaseEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BOOK_ID")
    private Book book;

    @Column
    private BigDecimal stockNum;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BigDecimal getStockNum() {
        return stockNum;
    }

    public void setStockNum(BigDecimal stockNum) {
        this.stockNum = stockNum;
    }

}
