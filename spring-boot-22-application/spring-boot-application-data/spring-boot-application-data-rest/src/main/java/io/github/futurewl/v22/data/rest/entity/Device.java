package io.github.futurewl.v22.data.rest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "t_device")
@org.hibernate.annotations.Table(appliesTo = "t_device", comment = "设备表")
public class Device extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "device")
    private List<DeviceLoop> deviceLoops;

    @ManyToMany
    private List<Project> projects;

    @ManyToMany
    private List<Project2> project2s;

    @ManyToOne
    private Project3 project3;

}
