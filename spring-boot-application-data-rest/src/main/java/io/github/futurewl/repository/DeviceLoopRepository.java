package io.github.futurewl.repository;

import io.github.futurewl.demo1.entity.DeviceLoop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface DeviceLoopRepository extends JpaRepository<DeviceLoop, Long> {
}
