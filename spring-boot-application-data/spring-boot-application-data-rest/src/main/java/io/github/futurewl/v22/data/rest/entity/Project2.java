package io.github.futurewl.v22.data.rest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "t_project2")
@org.hibernate.annotations.Table(appliesTo = "t_project2", comment = "项目表")
public class Project2 extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "project2s")
    private List<Device> devices;

    @OneToMany(mappedBy = "project2")
    private List<DeviceLoopGroup> deviceLoopGroups;

}
