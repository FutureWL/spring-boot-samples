package io.github.futurewl.demo1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Set;

@Getter
@Setter
@Entity
public class DeviceLoopGroup extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "deviceLoopGroup", cascade = {
            CascadeType.PERSIST,
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.REMOVE
    }, fetch = FetchType.EAGER)
    private Set<DeviceLoop> deviceLoops;

}
