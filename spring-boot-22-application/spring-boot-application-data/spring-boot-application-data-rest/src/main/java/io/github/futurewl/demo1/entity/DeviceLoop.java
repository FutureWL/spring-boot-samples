package io.github.futurewl.demo1.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class DeviceLoop extends BaseEntity {

    private String name;

    @ManyToOne
    private Device device;

    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    private DeviceLoopGroup deviceLoopGroup;

}
