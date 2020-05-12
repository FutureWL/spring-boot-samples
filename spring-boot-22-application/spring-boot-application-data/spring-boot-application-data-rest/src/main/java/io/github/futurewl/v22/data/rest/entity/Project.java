package io.github.futurewl.v22.data.rest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "t_project")
@org.hibernate.annotations.Table(appliesTo = "t_project", comment = "项目表")
public class Project extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "projects")
    private List<Device> devices;

}
