package io.github.futurewl.business.repository;

import io.github.futurewl.business.entity.BigCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-03-17:23:51
 * @version 1.0
 */
// 通过该注解，可以修改 URI 的Path
@RepositoryRestResource(collectionResourceRel = "companies", path = "companies")
public interface BigCompanyRepository extends JpaRepository<BigCompany, Long> {
}
