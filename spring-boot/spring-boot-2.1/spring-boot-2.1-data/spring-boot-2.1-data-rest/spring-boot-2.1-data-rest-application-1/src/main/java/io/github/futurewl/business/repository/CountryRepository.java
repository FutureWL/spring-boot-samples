package io.github.futurewl.business.repository;

import io.github.futurewl.business.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-05-11:09:03
 * @version 1.0
 */
public interface CountryRepository extends JpaRepository<Country, Long> {
}
