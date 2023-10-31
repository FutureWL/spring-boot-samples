package io.github.futurewl.sbs.v30x.service;

import io.github.futurewl.sbs.v30x.entity.SysUser;

import java.util.List;

public interface SysUserService {

    /**
     * 保存用户
     *
     * @param user
     */
    void save(SysUser user);

    /**
     * 删除用户
     *
     * @param id
     */
    void delete(String id);

    /**
     * 查询全部用户
     *
     * @return
     */
    List<SysUser> findAll();

}
