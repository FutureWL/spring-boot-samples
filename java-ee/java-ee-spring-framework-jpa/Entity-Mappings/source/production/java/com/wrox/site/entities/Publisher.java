package com.wrox.site.entities;

import java.io.Serializable;

@Entity(name = "PublisherEntity")
@Table(name = "Publishers", indexes = {
        @Index(name = "Publishers_Names", columnList = "PublisherName")
})
public class Publisher implements Serializable {
    private long id;
    private String name;
    private String address;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "PublisherGenerator")
    @TableGenerator(name = "PublisherGenerator", table = "SurrogateKeys",
            pkColumnName = "TableName", pkColumnValue = "Publishers",
            valueColumnName = "KeyValue", initialValue = 11923,
            allocationSize = 1)
    @Column(name = "PublisherId")
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PublisherName", nullable = false)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(nullable = false)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
