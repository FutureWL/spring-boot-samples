package io.github.futurewl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 销售单表
 *
 * @author 杨恩雄
 */
@Entity
@Table(name = "SALE")
public class Sale extends BaseEntity {

    @Column
    private Date createTime;

    // 非持久化字段，多本书之间用逗号隔开
    @Transient
    private String bookNames;

    // 非持久化字段，保存入库单总数量
    @Transient
    private BigDecimal money;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBookNames() {
        return bookNames;
    }

    public void setBookNames(String bookNames) {
        this.bookNames = bookNames;
    }


    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 设置图书名称，以逗号隔开
     */
    public void initBookNames(List<SaleItem> items) {
        StringBuffer names = new StringBuffer();
        for (int i = 0; i < items.size(); i++) {
            SaleItem item = items.get(i);
            String name = "《" + item.getBook().getName() + "》";
            if (i == 0) {
                names.append(name);
            } else {
                names.append(", " + name);
            }
        }
        this.bookNames = names.toString();
    }

    /**
     * 计算销售单的总金额
     */
    public void initMoney(List<SaleItem> items) {
        BigDecimal result = new BigDecimal(0);
        for (SaleItem item : items) {
            result = result.add(item.getPrice());
        }
        this.money = result;
    }
}
