package io.github.futurewl.v22.data.rest.repository;

import io.github.futurewl.v22.data.rest.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface DeviceRepository extends JpaRepository<Device, Long> {
}
