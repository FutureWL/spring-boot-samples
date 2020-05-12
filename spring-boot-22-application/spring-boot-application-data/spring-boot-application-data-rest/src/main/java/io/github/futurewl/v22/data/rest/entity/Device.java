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
@Table(name = "t_device")
@org.hibernate.annotations.Table(appliesTo = "t_device", comment = "设备表")
public class Device extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "device")
    private List<DeviceLoop> deviceLoops;

    @ManyToMany
    private List<Project> projects;

}
