package io.github.futurewl.repository;

import io.github.futurewl.demo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
