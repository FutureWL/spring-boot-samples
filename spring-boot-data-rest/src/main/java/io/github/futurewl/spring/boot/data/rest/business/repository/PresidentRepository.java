package io.github.futurewl.spring.boot.data.rest.business.repository;

import io.github.futurewl.spring.boot.data.rest.business.entity.President;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-11:09:03
 * @version 1.0
 */
public interface PresidentRepository extends JpaRepository<President, Long> {
}
