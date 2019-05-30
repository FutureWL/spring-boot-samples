package io.github.futurewl.spring.boot.data.rest.business.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 功能描述：总统实体
 *
 * @author weilai create by 2019-05-11:08:46
 * @version 1.0
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "t_president")
@org.hibernate.annotations.Table(appliesTo = "t_president", comment = "总统实体表")
public class President extends BaseEntity {

    /**
     * 名字
     */
    @Column(nullable = false, columnDefinition = "varchar(20) comment '名字'")
    private String name;

    /**
     * 年龄
     */
    @Column(nullable = false, columnDefinition = "int(3) comment '年龄'")
    private Integer age;

    @OneToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    // 需要设置country的president为当前country
    public void setCountry(Country country) {
        country.setPresident(this);
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        President president = (President) o;

        if (id != president.id) return false;
        if (name != null ? !name.equals(president.name) : president.name != null) return false;
        if (age != null ? !age.equals(president.age) : president.age != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Math.toIntExact(id);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

}
