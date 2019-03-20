package com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-03-20:14:12
 * @version 1.0
 */
@CrossOrigin
public interface User1Repository extends JpaRepository<User1, Long> {
}
