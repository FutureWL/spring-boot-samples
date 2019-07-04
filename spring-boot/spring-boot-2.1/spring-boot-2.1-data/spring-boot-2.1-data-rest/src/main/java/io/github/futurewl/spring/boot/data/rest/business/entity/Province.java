package io.github.futurewl.spring.boot.data.rest.business.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 功能描述：省实体
 *
 * @author weilai create by 2019-05-11:08:46
 * @version 1.0
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "t_province")
@org.hibernate.annotations.Table(appliesTo = "t_province", comment = "省实体表")
public class Province extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    public Province(String name) {
        this.name = name;
    }

    public Province(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Province province = (Province) o;

        if (id != province.id) return false;
        if (name != null ? !name.equals(province.name) : province.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Math.toIntExact(id);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

}
