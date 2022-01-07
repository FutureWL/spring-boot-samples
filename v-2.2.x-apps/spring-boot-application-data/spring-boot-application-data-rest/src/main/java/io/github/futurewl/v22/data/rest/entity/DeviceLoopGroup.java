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
@Table(name = "t_device_loop_group")
@org.hibernate.annotations.Table(appliesTo = "t_device_loop_group", comment = "设备回路组表")
public class DeviceLoopGroup extends BaseEntity {

    /**
     * 设备回路组名称
     */
    private String name;

    @ManyToOne
    private Project project;

    @ManyToOne
    private Project2 project2;

    /**
     * 设备回路列表
     */
    @ManyToMany(mappedBy = "deviceLoopGroups")
    private List<DeviceLoop> deviceLoops;

}
