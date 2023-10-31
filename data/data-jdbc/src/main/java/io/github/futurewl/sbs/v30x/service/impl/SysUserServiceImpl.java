package io.github.futurewl.sbs.v30x.service.impl;

import io.github.futurewl.sbs.v30x.dao.SysUserDao;
import io.github.futurewl.sbs.v30x.entity.SysUser;
import io.github.futurewl.sbs.v30x.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public void save(SysUser user) {
        sysUserDao.save(user);
    }

    @Override
    public void delete(String id) {
        sysUserDao.delete(id);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserDao.findAll();
    }
}
