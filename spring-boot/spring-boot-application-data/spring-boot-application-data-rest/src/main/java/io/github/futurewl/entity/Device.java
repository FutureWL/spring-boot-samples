package io.github.futurewl.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class Device extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<DeviceLoop> deviceLoops;

}
