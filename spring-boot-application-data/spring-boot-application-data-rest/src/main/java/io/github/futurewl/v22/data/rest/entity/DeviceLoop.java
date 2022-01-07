package io.github.futurewl.v22.data.rest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "t_device_loop")
@org.hibernate.annotations.Table(appliesTo = "t_device_loop", comment = "设备回路表")
public class DeviceLoop extends BaseEntity {

    private String name;

    @ManyToOne
    private Device device;

    @ManyToMany
    private List<DeviceLoopGroup> deviceLoopGroups;

}
