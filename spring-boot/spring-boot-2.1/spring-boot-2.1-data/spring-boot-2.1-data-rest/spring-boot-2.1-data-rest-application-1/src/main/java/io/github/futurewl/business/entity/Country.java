package io.github.futurewl.business.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述：国家实体
 * country（国家）  1:1 president（总统）
 * country（国家）  1:n province（省份）
 * country（国家）  n:n company（跨国公司）
 *
 * @author weilai create by 2019-05-11:08:46
 * @version 1.0
 */
@Data
@Entity
@Table(name = "t_country")
@org.hibernate.annotations.Table(appliesTo = "t_country", comment = "国家实体表")
public class Country extends BaseEntity {

    /**
     * 名字
     */
    @Column(nullable = false, columnDefinition = "varchar(20) comment '名字'")
    private String name;

    @OneToOne(mappedBy = "country", cascade = CascadeType.ALL)
    private President president;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Province> provinces = new HashSet<>();

    @ManyToMany(mappedBy = "countries", cascade = CascadeType.ALL)
    private Set<BigCompany> companies = new HashSet<>();


    public void setPresident(President president) {
        president.setCountry(this);
        this.president = president;
    }

    public void addProvince(Province province) {
        province.setCountry(this);
        provinces.add(province);
    }

    public void setProvinces(Set<Province> provinces) {
        if (provinces != null) {
            provinces.forEach(province -> province.setCountry(this));
        }
        this.provinces = provinces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (id != country.id) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Math.toIntExact(id);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


}
