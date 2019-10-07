package io.github.futurewl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

/**
 * 入库单
 *
 * @author 杨恩雄
 */
@Entity
@Table(name = "STORE")
public class Store extends BaseEntity {

    @Column
    private Date createTime;

    // 非持久化字段，多本书之间用逗号隔开
    @Transient
    private String bookNames;

    // 非持久化字段，保存入库单总数量
    @Transient
    private int amount;

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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * 设置图书名称，以逗号隔开
     */
    public void initBookNames(List<StoreItem> items) {
        StringBuffer names = new StringBuffer();
        for (int i = 0; i < items.size(); i++) {
            StoreItem item = items.get(i);
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
     * 计算当前入库单的总数量
     */
    public void initAmount(List<StoreItem> items) {
        int result = 0;
        for (StoreItem item : items) {
            result += item.getAmount();
        }
        this.amount = result;
    }
}
