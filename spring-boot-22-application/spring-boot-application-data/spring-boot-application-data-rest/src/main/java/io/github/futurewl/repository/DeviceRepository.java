package io.github.futurewl.repository;

import io.github.futurewl.demo1.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
