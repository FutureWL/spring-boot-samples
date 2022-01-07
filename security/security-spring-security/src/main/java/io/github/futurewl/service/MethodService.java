package io.github.futurewl.demo1.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class MethodService {

    @Secured("ROLE_ADMIN")// 需要该角色，需要加上 ROLE_ 前缀
    public String admin() {
        return "hello admin";
    }

    @PreAuthorize("hasRole('ADMIN') and hasRole('DBA')")
    public String dba() {
        return "hello dba";
    }

    @PreAuthorize("hasAnyRole('ADMIN','USER','DBA')")
    public String user() {
        return "hello user";
    }

}
