package io.github.futurewl.business.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 功能描述：跨国公司实体
 *
 * @author weilai create by 2019-05-11:08:46
 * @version 1.0
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "t_big_company")
@org.hibernate.annotations.Table(appliesTo = "t_big_company", comment = "跨国公司实体表")
public class BigCompany extends BaseEntity {

    private String name;

    @ManyToMany
    @JoinTable(name = "rel_country_company",
            joinColumns = @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "country_id", referencedColumnName = "id", nullable = false))
    private Set<Country> countries = new HashSet<>();


    public BigCompany(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BigCompany that = (BigCompany) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Math.toIntExact(id);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
