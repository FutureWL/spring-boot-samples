package io.github.futurewl.v22.data.rest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "t_project3")
@org.hibernate.annotations.Table(appliesTo = "t_project3", comment = "项目表")
public class Project3 extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "project3")
    private List<Device> devices;

}
